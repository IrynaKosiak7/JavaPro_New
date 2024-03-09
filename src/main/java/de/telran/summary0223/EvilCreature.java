package de.telran.summary0223;

import java.util.Random;

public class EvilCreature extends Character{
    private int force;
    private  int protection;
    public EvilCreature(String name,  int force, int protection) {
        super(name);
        this.force = force;
        this.protection = protection;
    }

    public static EvilCreature generateRandomEvilCreature(){
        Random random = new Random();
        EvilCreatuereRandomChoice choice = EvilCreatuereRandomChoice.values()[random.nextInt(3)];
        EvilCreature evilCreature = new EvilCreature(choice.name(), choice.force, choice.protection);

        return evilCreature;
    }

    @Override
    public String toString() {
        return "EvilCreature{" +
                "name = " + getName() +
                ", force=" + force +
                ", protection=" + protection +
                '}';
    }
    public int countForce(){
        return force;
    }
    public int countProtection(){
        return  protection;
    }
}

