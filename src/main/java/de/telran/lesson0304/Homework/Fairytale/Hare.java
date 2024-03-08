package de.telran.lesson0304.Homework.Fairytale;

public class Hare {
    private String color;
    private boolean canMove;
    private Duck duck;

    public Hare(String color, boolean canMove,Duck duck) {
        this.color = color;
        this.canMove = canMove;
        this.duck = duck;
    }
    public Hare deepCopy() {
        Duck newDuck = new Duck(duck.getColor(), duck.isCanToSwim(), duck.getEgg());
        return new Hare( color,canMove, newDuck);
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    public boolean isCanMove() {
        return canMove;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Duck getDuck() {
        return duck;
    }

    public void setDuck(Duck duck) {
        this.duck = duck;
    }

    @Override
    public String toString() {
        return "Hare{" +
                "color='" + color + '\'' +
                ", canMove=" + canMove +
                ", duck=" + duck +
                '}';
    }
}
