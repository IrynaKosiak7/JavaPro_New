package de.telran.summary0223;

public class Superhero extends Character {
    private int force;
    private Weapon weapon;
    private Protection protection;


    public Superhero(String name, int force, Weapon weapon, Protection protection) {
        super(name);
        this.force = force;
        this.weapon = weapon;
        this.protection = protection;
    }

    public int getForce() {
        return force;
    }

    public void setForce(double force) {
        this.force = (int) force;
    }

    public int countForce(){
      return  force + weapon.getForce();
    }
    public int countProtection(){
        return  protection.getLevel();
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "force=" + force +
                ", weapon=" + weapon +
                ", protection=" + protection +
                '}';
    }
}
