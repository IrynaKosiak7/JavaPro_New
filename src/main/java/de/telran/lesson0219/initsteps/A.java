package de.telran.lesson0219.initsteps;

public class A {
    static  String staticField = "staticField";

    static {
        System.out.println("static init block ");
        staticField = "new static value";
    }
    String nonStaticField = "nonStaticField";
    {
        System.out.println("Non static init block ");
        nonStaticField =  "new non static value";

    }
    public A ( String nonStaticField){
        System.out.println("Constructor at work");
        this.nonStaticField = nonStaticField;
    }
    public static void staticMethod(){
        System.out.println("Static method called");
        System.out.println(staticField);
    }
    public void nonStaticMethod(){
        System.out.println("Non static method called");
        System.out.println(nonStaticField);
    }
}
