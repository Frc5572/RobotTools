package org.frc5572.robotools.util.tree;

import java.lang.reflect.Field;

import org.frc5572.robotools.util.ReflectionUtil;

public class JCClassTree {
    
    private final Object underlyingJavacObject;

    public JCClassTree(Object object) {
        this.underlyingJavacObject = object;
    }

    private static final Field defs;

    static {
        Field defs_ = null;
        try {
            Class<?> clazz = Class.forName("com.sun.tools.javac.tree.JCTree.JCClassDecl");
            defs_ = ReflectionUtil.getField(clazz, "defs");
            Field extending = ReflectionUtil.getField(clazz, "extending");
        } catch (Exception e) {
            e.printStackTrace();
        }
        defs = defs_;
    }

}
