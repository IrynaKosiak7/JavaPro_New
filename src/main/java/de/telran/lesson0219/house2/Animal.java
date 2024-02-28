package de.telran.lesson0219.house2;

public abstract class Animal extends LivingCreature{
    private String colour;
    private boolean isHungry;

    public Animal(String name, int age, String colour, boolean isHungry) {
        super(name, age);
        this.colour = colour;
        this.isHungry = isHungry;
    }


    public void feed(){
        isHungry = false;
        System.out.println("Animal " + getName() + " is not hungry anymore");
    }
    public void displayAnimalInfo(){
        System.out.println("Animal info:");
        System.out.println(getName() + ", colour: " + colour + ", age: " + getAge() + ", isHungry: " + isHungry);
        sayHello();
        System.out.println("--------------");
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public boolean isHungry() {
        return isHungry;
    }
    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
}