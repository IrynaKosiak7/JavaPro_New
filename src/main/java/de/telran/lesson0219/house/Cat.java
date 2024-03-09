package de.telran.lesson0219.house;

public class Cat {
    private String name;
    private String colour;
    private int age;
    private boolean isHungry;


    public Cat(String catName, String catColour, int catAge) {
        name = catName;
        colour = catColour;
        age = catAge;
        isHungry = true;
    }

    public void sayHello() {
        System.out.println("Meow! " + "I'm " + name);
    }

    public void feed() {
        isHungry = false;
        System.out.println("Cat " + name + " is not hungry anymore");
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public boolean isHungry() {
        return isHungry;
    }
    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
}
