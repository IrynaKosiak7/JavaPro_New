package de.telran.lesson0226.interfaces;

public interface SomeInterface {
    public static final int number = 10;

    public abstract void someMethod();

    String someMethod(String s);

    static void staticMetod() {
        System.out.println(" staticMethod in interface");
    }

    default void defaultMethod() {
        System.out.println("dafaultMethod in interface");
    }
}
