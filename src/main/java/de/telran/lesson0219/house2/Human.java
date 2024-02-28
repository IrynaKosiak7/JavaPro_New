package de.telran.lesson0219.house2;

public class Human extends LivingCreature implements Walk {

    public Human(String name, int age) {
        super(name, age);
    }
    public void sayHello() {
        System.out.println(" I'm human. My name is " + getName());
    }

    public void walk(Animal animal) {
        System.out.println(getName() + " walks with "+ animal.getClass().getSimpleName() + " - " + animal.getName());
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
        System.out.println(getName() + " chase " + another.getClass().getSimpleName());
    }

}
