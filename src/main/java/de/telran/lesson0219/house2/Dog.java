package de.telran.lesson0219.house2;

public class Dog extends Animal {

    public Dog(String name, int age, String colour, boolean isHungry) {
        super(name, age, colour, isHungry);
    }

    @Override
    public void sayHello() {
        System.out.println("Gav! I'm dog. My name is " + super.getName());
    }

    public void bark() {
        System.out.println("Gav! Gav!");
    }
    public void play(Creature another) {
        if (another.getClass() == Cat.class) {
            System.out.println(getName() + " barks at "+ another.getClass().getSimpleName());
        }else {
            super.play(another);
        }
    }

}