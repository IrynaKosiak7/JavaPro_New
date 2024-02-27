package de.telran.lesson0219.house2;

public abstract class Creature {
    private String name;

    public Creature(String name) {
        this.name = name;
    }

    public abstract void sayHello();
    public void play(Creature another){
        System.out.println(this.getName() + " plays with " + another.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
