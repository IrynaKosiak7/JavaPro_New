package de.telran.lesson0221.initsteps;

public class Child extends Parent{
    static{
        System.out.println("child static init");
    }
    {
        System.out.println("child non static init");
    }
    public Child(){
        System.out.println("child constructer");
    }
    public static void staticMethod(){
        System.out.println("child staticMethod");
    }
}
