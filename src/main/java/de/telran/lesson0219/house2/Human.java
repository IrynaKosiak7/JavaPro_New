package de.telran.lesson0219.house2;

public class Human extends Creature {
    private int ageHuman;
    public Human(String name, int ageHuman) {
        super(name);
        this.ageHuman = ageHuman;
    }
    public int getAgeHuman() {
        return ageHuman;
    }

    public void setAgeHuman(int ageHuman) {
        this.ageHuman = ageHuman;
    }
    public void sayHello() {
        System.out.println(" I'm human. My name is " + getName());
    }

    public void walkAnimal(Animal animal) {
        System.out.println("Human " + getName() + " walks with "+ animal.getClass().getSimpleName() + " - " + animal.getName());
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

    public int grow() {
        int newAge = ageHuman + 1;
        System.out.println("I " + " am " + getName() +", "  + newAge + " years old");
        return newAge;
    }

}
