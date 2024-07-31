package org.frc5572.robotools;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ModuleElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;

import org.frc5572.robotools.autoprofile.AutoProfileProcessor;
import org.frc5572.robotools.serde.SerdeProcessor;

/**
 * Annotation processor for RobotTools.
 */
@SupportedAnnotationTypes("*")
@SupportedSourceVersion(SourceVersion.RELEASE_17)
public class RobotProcessor extends AbstractProcessor {

    private boolean hasProcessed;

    /** Initialization function */
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        hasProcessed = false;
    }

    /** Process all elements. */
    @Override
    public boolean process(Set<? extends TypeElement> arg0, RoundEnvironment roundEnv) {
        if (hasProcessed) {
            return false;
        }
        hasProcessed = true;
        List<TypeElement> typeElements = new ArrayList<>();
        for (ModuleElement mod : processingEnv.getElementUtils().getAllModuleElements()) {
            if (!mod.isUnnamed()) {
                continue;
            }
            for (Element element : mod.getEnclosedElements()) {
                if (element instanceof PackageElement packageElement) {
                    for (Element element2 : packageElement.getEnclosedElements()) {
                        if (element2 instanceof TypeElement typeElement) {
                            typeElements.add(typeElement);
                        }
                    }

                }
            }
        }
        CompilationData compilationData = new CompilationData(typeElements, processingEnv);
//        SerdeProcessor.processTypes(compilationData);
//        AutoProfileProcessor.processTypes(compilationData);
        return false;
    }

}
