package de.telran.lesson0226.interfaces;

public class SomeInterfaceImpl implements SomeInterface{
    @Override
    public void someMethod() {
        System.out.println("someMethod");
    }

    @Override
    public void defaultMethod() {
//        SomeInterface.defaultMethod();
        System.out.println("SomeinterfaceImpl  imp of default method");
    }

//    @Override
//    public void defaultMethod() {
//        SomeInterface.super.defaultMethod();
//    }

    @Override
    public String someMethod(String s) {
        return s;
    }

    public static void main(String[] args) {
        SomeInterface someInterface = new SomeInterfaceImpl();
        someInterface.someMethod();
        System.out.println(someInterface.someMethod("param"));
        someInterface.defaultMethod();

        someInterface = new SomeInterfaceImpl2();
        someInterface.someMethod();
        System.out.println(someInterface.someMethod("param"));

        System.out.println(SomeInterface.number);
        SomeInterface.staticMetod();

        someInterface.defaultMethod();
    }
}
