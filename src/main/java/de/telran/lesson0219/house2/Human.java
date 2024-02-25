package de.telran.lesson0219.house2;

public class Human extends Creature{

    private String name;

    public Human(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println(" I'm human. My name is " + name);
    }

    public void walkAnimal(Animal animal){
        animal.setHungry(true);
        System.out.println("Animal " + animal.getName() + " is hungry after a walk.");
    }

    public void feedAnimal(Animal animal) {
        animal.feed();
    }

    public void feedAnimal(Animal... animals) {
        for (Animal a : animals) {
            a.feed();
        }
    }
    public void play(Creature another) {
        System.out.println(name + " chase " + another.getClass().getSimpleName());
    }


}
