package org.frc5572.processor;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;

/**
 * This Annotation Processor is used to change how Java processes .java files.
 */
@SupportedAnnotationTypes("*")
public class RobotProcessor extends AbstractProcessor {

    private ProcessingEnvironment processingEnv;

    /** {@inheritDoc} */
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);

    }

    /** {@inheritDoc} */
    @Override
    public boolean process(Set<? extends TypeElement> arg0, RoundEnvironment arg1) {

        return false;
    }

}
