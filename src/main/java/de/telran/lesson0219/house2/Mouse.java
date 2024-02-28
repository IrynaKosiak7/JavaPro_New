package de.telran.lesson0219.house2;

public class Mouse extends Animal{
    public Mouse(String name, int age, String colour, boolean isHungry) {
        super(name, age, colour, isHungry);
    }

    @Override
    public void sayHello() {
        System.out.println("I'm mouse " + getName() + " pi-pi.");
    }
}
