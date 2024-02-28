package de.telran.lesson0219.house2;

public abstract class LivingCreature extends Creature{
    private int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public LivingCreature(String name,int age) {
        super(name);
        this.age = age;
    }
    public int grow(){
        int newAge = age + 1;
        System.out.println("I " + " am " + getName() +", "  + newAge + " years old");
        return newAge;
    }
}
