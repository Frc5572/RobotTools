package org.frc5572.robotools.checks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.ArrayType;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.SimpleAnnotationValueVisitor9;
import org.frc5572.robotools.CompilationData;
import org.frc5572.robotools.IOTypes;

/** Performs checks to see that Subsystems do not contain raw IO types. */
public class IOCheck implements Check {

    private void checkType(CompilationData data, Element[] warnPos, String path, TypeElement elem,
        Set<String> skip, String post) {
        for (String iface : IOTypes.ioInterfaces) {
            if (data.implementsInterface(elem, iface)) {
                String[] parts = iface.split("\\.");
                for (Element warnElem : warnPos) {

                    data.error(warnElem, path + " is a " + parts[parts.length - 1]
                        + " which performs IO. It should be in an IO class!");

                }
                return;
            }
        }
        for (String class_ : IOTypes.ioClasses) {
            if (data.extendsClass(elem, class_)) {
                String[] parts = class_.split("\\.");
                for (Element warnElem : warnPos) {

                    data.error(warnElem, path + " is a " + parts[parts.length - 1]
                        + " which performs IO. It should be in an IO class!");

                }
                return;
            }
        }
        if (skip.contains(elem.getQualifiedName().toString())) {
            return;
        }
        skip.add(elem.getQualifiedName().toString());
        outer: for (var item : elem.getEnclosedElements()) {
            if (item instanceof VariableElement) {
                VariableElement variable = (VariableElement) item;
                for (AnnotationMirror mirror : item.getAnnotationMirrors()) {
                    Element annotationElement = mirror.getAnnotationType().asElement();
                    if (annotationElement instanceof TypeElement) {
                        TypeElement annotationType = (TypeElement) annotationElement;
                        if (annotationType.getQualifiedName().toString()
                            .equals("java.lang.SuppressWarnings")) {
                            for (var entry : mirror.getElementValues().entrySet()) {
                                if (entry.getValue()
                                    .accept(new SimpleAnnotationValueVisitor9<Boolean, Void>() {

                                        @Override
                                        public Boolean visitArray(
                                            List<? extends AnnotationValue> vals, Void p) {
                                            for (AnnotationValue v : vals) {
                                                if (v.accept(this, null)) {
                                                    return true;
                                                }
                                            }
                                            return false;
                                        }

                                        @Override
                                        public Boolean visitString(String s, Void p) {
                                            if (s.equals("IOCheck")) {
                                                return true;
                                            }
                                            return false;
                                        }
                                    }, null)) {
                                    continue outer;
                                }
                            }
                        }
                    }
                }
                String post2 = "";
                TypeMirror typeMirror = variable.asType();
                while (typeMirror instanceof ArrayType) {
                    typeMirror = ((ArrayType) typeMirror).getComponentType();
                    post2 += "[*]";
                }
                Element element = data.types.asElement(typeMirror);
                Element[] newElements = new Element[warnPos.length + 1];
                for (int i = 0; i < warnPos.length; i++) {
                    newElements[i] = warnPos[i];
                }
                newElements[warnPos.length] = variable;
                if (element instanceof TypeElement) {
                    TypeElement type = (TypeElement) element;
                    checkType(data, newElements,
                        path + post + "." + variable.getSimpleName().toString(), type, skip, post2);
                }
            }
        }
    }

    /** Perform check. */
    @Override
    public boolean check(CompilationData data) {
        if (data.implementsInterface("edu.wpi.first.wpilibj.RobotBase")) {
            for (var item : data.element.getEnclosedElements()) {
                if (item instanceof VariableElement) {
                    VariableElement variable = (VariableElement) item;
                    String path =
                        data.element.getQualifiedName() + "." + variable.getSimpleName().toString();
                    String post = "";
                    TypeMirror typeMirror = variable.asType();
                    while (typeMirror instanceof ArrayType) {
                        typeMirror = ((ArrayType) typeMirror).getComponentType();
                        post += "[*]";
                    }
                    Element element = data.types.asElement(typeMirror);
                    if (element instanceof TypeElement) {
                        TypeElement type = (TypeElement) element;
                        Set<String> skip = new HashSet<>();
                        checkType(data, new Element[] {variable}, path, type, skip, post);
                    }
                }
            }
        }
        return false;
    }

}
