package de.telran.lesson0219.house2;

public class Dog extends Animal {

    public Dog(String name, String colour, int age) {
        super(name, colour, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Gav! I'm dog. My name is " + super.getName());
    }

    public void bark() {
        System.out.println("Gav! Gav!");
    }
    public void play(Creature another) {
        System.out.println(getName() + " barks at "+ another.getClass().getSimpleName());
    }


}