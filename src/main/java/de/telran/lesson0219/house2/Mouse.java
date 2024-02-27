package de.telran.lesson0219.house2;

public class Mouse extends Animal{
    public Mouse(String name, String colour, int age) {
        super(name, colour, age);
    }

    @Override
    public void sayHello() {
        System.out.println("I'm mouse " + getName() + " pi-pi.");
    }
}
