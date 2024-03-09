package de.telran.lesson0221;

public class Child extends Parents{
    public String name = "Name";
    public int publicField = 20;
    public void method(){
        System.out.println("child method " + publicField);
        System.out.println("child method " + super.publicField);
    }
    @Override
    public void publicMethod(){
        super.publicMethod();
        System.out.println("Child public method");
    }
}
