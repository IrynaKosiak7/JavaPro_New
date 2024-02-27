package de.telran.lesson0219.house2;

public class Cat extends Animal {

    public Cat(String catName){
        this(catName, "white", 1);
    }

    public Cat(String catName, String catColour, int catAge){
        super(catName, catColour, catAge);
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