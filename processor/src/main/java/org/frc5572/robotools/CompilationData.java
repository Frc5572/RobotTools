package org.frc5572.robotools;

import java.util.Collection;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.TypeElement;

public class CompilationData {

    public final TypeElement[] types;
    

    public CompilationData(Collection<TypeElement> types, ProcessingEnvironment processingEnvironment) {
        this.types = types.toArray(TypeElement[]::new);
    }
    
}
