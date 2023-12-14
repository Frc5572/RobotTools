package org.frc5572.robotools;

import java.io.IOException;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedOptions;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ModuleElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;

/**
 * Annotation processor.
 */
@SupportedAnnotationTypes("*")
@SupportedSourceVersion(SourceVersion.RELEASE_11)
public class RobotProcessor extends AbstractProcessor {
    private int round = 0;
    
    private GeneratedAnnotation procMacroAnnotation = new GeneratedAnnotation("org.frc5572.proc_macro.ProcMacro", new GeneratedAnnotation.StringAnnotationArgument());

    /** Initialization function */
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
    }

    /** Process all elements. */
    @Override
    public boolean process(Set<? extends TypeElement> arg0, RoundEnvironment roundEnv) {
        round += 1;
        System.out.println("process round " + round);
        if (round == 1) {
            // Round 1: create ProcMacro types
            try {
                procMacroAnnotation.generateJavaFiles(processingEnv.getFiler());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;
        }
        if (round == 2) {
            // Create ProcMacro Impls
            for (ModuleElement mod : processingEnv.getElementUtils().getAllModuleElements()) {
                if (!mod.isUnnamed()) {
                    continue;
                }
                for (Element element : mod.getEnclosedElements()) {
                    if (element instanceof PackageElement) {
                        PackageElement packageElement = (PackageElement) element;
                        if (packageElement.getQualifiedName().toString().startsWith("frc.")) {
                            for (Element element2 : packageElement.getEnclosedElements()) {
                                if (element2 instanceof TypeElement) {
                                    TypeElement typeElement = (TypeElement) element2;
                                    for (AnnotationMirror classAnnotation : typeElement.getAnnotationMirrors()) {
                                        System.out.println("@" + classAnnotation.getAnnotationType());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(round >= 3) {
            // Evaluate ProcMacro Impls

        }
        return false;
    }

}
