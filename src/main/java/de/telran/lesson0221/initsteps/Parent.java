package de.telran.lesson0221.initsteps;

public class Parent {
    static{
        System.out.println("Parent static init");
    }
    {
        System.out.println("parent non static init");
    }
    public Parent(){
        System.out.println("parent constructor");
    }
    public static void staticMethod(){
        System.out.println("parent staticMethod");
    }
}
