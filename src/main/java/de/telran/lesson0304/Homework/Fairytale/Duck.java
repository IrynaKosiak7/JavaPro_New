package de.telran.lesson0304.Homework.Fairytale;

public class Duck {
    private String color;
    private boolean canToSwim;
    private Egg egg;

    public Duck(String color, boolean canToSwim, Egg egg) {
        this.color = color;
        this.canToSwim = canToSwim;
        this.egg = egg;
    }
    public Duck deepCopy() {
        Egg newEgg = new Egg(egg.getColor(),egg.getSize(), egg.getNeedle());
        return new Duck( color, canToSwim, newEgg);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanToSwim() {
        return canToSwim;
    }

    public void setCanToSwim(boolean canToSwim) {
        this.canToSwim = canToSwim;
    }
    public Egg getEgg() {
        return egg;
    }

    public void setEgg(Egg egg) {
        this.egg = egg;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "color='" + color + '\'' +
                ", canToSwim=" + canToSwim +
                ", egg=" + egg +
                '}';
    }
}
