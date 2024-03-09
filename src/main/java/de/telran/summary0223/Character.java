package de.telran.summary0223;

public abstract class Character {
    private String name;
    private int health = 100;


    public Character(String name) {
        this.name = name;
        this.health = getHealth();
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void inroduce(){
        System.out.println("Hello, my name is " + name);
    }
    public abstract int countForce();
    public abstract int countProtection();
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public void fight(Character another){
    int thisForce = countForce();
    int anotherForce = another.countForce();
        if (anotherForce < thisForce) {
            health = health - (thisForce - anotherForce)/countProtection();
            System.out.println(name + " wins with health - " + health);
        } else if (anotherForce > thisForce) {
            another.health = another.health - (anotherForce - thisForce)/another.countProtection();
            System.out.println(another.name + " wins with health - " + health);
        } else {
            System.out.println(name + " and " + another.name + " are equal force");
        }
    }

}
