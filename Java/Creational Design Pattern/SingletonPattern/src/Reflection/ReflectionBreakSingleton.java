package Reflection;

import EagerInitialization.EagerInitializedSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * Reflection có thể được dùng để phá vỡ Pattern của Eager Initialization ở trên.
 * Tương tự Eager Initialization, implement theo Bill Pugh Singleton cũng bị break bởi Reflection.
 * */
public class ReflectionBreakSingleton {
    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException, InvocationTargetException {

        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;

        Constructor<?>[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
