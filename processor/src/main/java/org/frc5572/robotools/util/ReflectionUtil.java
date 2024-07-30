package org.frc5572.robotools.util;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class ReflectionUtil {
    private ReflectionUtil() {}

    private static final sun.misc.Unsafe UNSAFE = (sun.misc.Unsafe) staticFieldAccess(sun.misc.Unsafe.class, "theUnsafe");

    private static final long ACCESSIBLE_OVERRIDE_FIELD_OFFSET;
    private static final IllegalAccessException INIT_ERROR;

    @SuppressWarnings("deprecation")
    private static long getOverrideFieldOffset() throws Throwable {
        Field f = null;
        Throwable saved = null;
        try {
            f = AccessibleObject.class.getDeclaredField("override");
        } catch(Throwable t) {
            saved = t;
        }

        if (f != null) {
            return UNSAFE.objectFieldOffset(f);
        }

        try{
            return UNSAFE.objectFieldOffset(Fake.class.getDeclaredField("override"));
        } catch(Throwable t) {
            throw saved;
        }
    }

    static {
        long g;
        Throwable ex;
        try {
            g = getOverrideFieldOffset();
            ex = null;
        } catch (Throwable t) {
            g = -1L;
            ex = t;
        }

        ACCESSIBLE_OVERRIDE_FIELD_OFFSET = g;
        if(ex == null) {
            INIT_ERROR = null;
        } else if(ex instanceof IllegalAccessException ex2) {
            INIT_ERROR = ex2;
        } else {
            INIT_ERROR = new IllegalAccessException("Cannot initialize Unsafe-based Reflection Util.");
            INIT_ERROR.initCause(ex);
        }
    }

    private static Object staticFieldAccess(Class<?> clazz, String name) {
        try {
            Field f = clazz.getDeclaredField(name);
            f.setAccessible(true);
            return f.get(null);
        } catch(Exception e) {
            return null;
        }
    }

    static class Fake {
        boolean override;
        Object accessCheckCache;
    }

    public static <T extends AccessibleObject> T setAccessible(T accessor) {
        if(INIT_ERROR == null) {
            UNSAFE.putBoolean(accessor, ACCESSIBLE_OVERRIDE_FIELD_OFFSET, true);
        } else {
            accessor.setAccessible(true);
        }

        return accessor;
    }

    public static Method getMethod(Class<?> c, String mName, Class<?>... parameterTypes) throws NoSuchMethodException {
		Method m = null;
		Class<?> oc = c;
		while (c != null) {
			try {
				m = c.getDeclaredMethod(mName, parameterTypes);
				break;
			} catch (NoSuchMethodException e) {}
			c = c.getSuperclass();
		}
		
		if (m == null) throw new NoSuchMethodException(oc.getName() + " :: " + mName + "(args)");
		return setAccessible(m);
	}
	
	public static Method permissiveGetMethod(Class<?> c, String mName, Class<?>... parameterTypes) {
		try {
			return getMethod(c, mName, parameterTypes);
		} catch (Exception ignore) {
			return null;
		}
	}
	
	public static Field getField(Class<?> c, String fName) throws NoSuchFieldException {
		Field f = null;
		Class<?> oc = c;
		while (c != null) {
			try {
				f = c.getDeclaredField(fName);
				break;
			} catch (NoSuchFieldException e) {}
			c = c.getSuperclass();
		}
		
		if (f == null) throw new NoSuchFieldException(oc.getName() + " :: " + fName);
		
		return setAccessible(f);
	}
	
	public static Field permissiveGetField(Class<?> c, String fName) {
		try {
			return getField(c, fName);
		} catch (Exception ignore) {
			return null;
		}
	}
	
	public static <T> T permissiveReadField(Class<T> type, Field f, Object instance) {
		try {
			return type.cast(f.get(instance));
		} catch (Exception ignore) {
			return null;
		}
	}

    public static <T> Constructor<T> getConstructor(Class<T> c, Class<?>... parameterTypes) throws NoSuchMethodException {
		return setAccessible(c.getDeclaredConstructor(parameterTypes));
	}

    public static Object invoke(Method m, Object receiver, Object... args) throws IllegalAccessException, InvocationTargetException {
		return invoke(null, m, receiver, args);
	}
	
	public static Object invoke(Throwable initError, Method m, Object receiver, Object... args) throws IllegalAccessException, InvocationTargetException {
		try {
			return m.invoke(receiver, args);
		} catch (IllegalAccessException e) {
			throw e;
		} catch (RuntimeException e) {
			throw e;
		} catch (Error e) {
			throw e;
		}
	}

    public static <T> T newInstance(Constructor<T> c, Object... args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
		return newInstance(null, c, args);
	}
	
	public static <T> T newInstance(Throwable initError, Constructor<T> c, Object... args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
		try {
			return c.newInstance(args);
		} catch (IllegalAccessException e) {
			throw e;
		} catch (InstantiationException e) {
			throw e;
		} catch (RuntimeException e) {
			throw e;
		} catch (Error e) {
			throw e;
		}
	}

    @SuppressWarnings("unchecked")
    public static <T> T get(Field f, Object receiver) throws IllegalAccessException {
		try {
			return (T) f.get(receiver);
		} catch (IllegalAccessException e) {
			throw e;
		} catch (RuntimeException e) {
			throw e;
		} catch (Error e) {
			throw e;
		}
	}
	
	public static void set(Field f, Object receiver, Object newValue) throws IllegalAccessException {
		try {
			f.set(receiver, newValue);
		} catch (IllegalAccessException e) {
			throw e;
		} catch (RuntimeException e) {
			throw e;
		} catch (Error e) {
			throw e;
		}
	}

}
