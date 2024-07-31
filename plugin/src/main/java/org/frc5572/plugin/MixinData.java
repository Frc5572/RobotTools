package org.frc5572.plugin;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassVisitor;

public class MixinData extends ClassVisitor {

    public boolean isMixin;

    protected MixinData(int api) {
        super(api);
        isMixin = false;
    }

    @Override
    public AnnotationVisitor visitAnnotation(String descriptor, boolean visible) {
        if(descriptor.equals("Lorg/frc5572/util/mixin/Mixin;")) {
            this.isMixin = true;
        }
        return super.visitAnnotation(descriptor, visible);
    }
    
}
