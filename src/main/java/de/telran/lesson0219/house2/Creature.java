package de.telran.lesson0219.house2;

public abstract class Creature {
    public abstract void sayHello();
    public void play(Creature another){
        System.out.println("We play each other");
    }

}
