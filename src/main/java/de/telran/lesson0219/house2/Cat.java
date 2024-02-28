package de.telran.lesson0219.house2;

public class Cat extends Animal implements CatchMouse {
    public Cat(String name, int age, String colour, boolean isHungry) {
        super(name, age, colour, isHungry);
    }

    public void sayHello(){
        System.out.println("Meow! I'm cat. My name is " + super.getName());
    }

    public void meow() {
        System.out.println("Meow!");
    }

    public void play(Creature another) {
        if (another.getClass() == Dog.class) {
            System.out.println(getName() + " runs away from dog " + another.getName());
        } else {
            super.play(another);
        }
    }
    public void catchMouse(Mouse mouse){
        System.out.println("I " + getName() + "  catch " + mouse.getName());
    }

}