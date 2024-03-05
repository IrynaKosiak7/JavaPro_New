package de.telran.lesson0304.Homework.Fairytale;

public class Hare extends Сhest {
    private boolean canMove;

    public Hare(int size, String color, boolean canMove) {
        super(size, color);
        this.canMove = canMove;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    public boolean isCanMove() {
        return canMove;
    }

    @Override
    public String toString() {
        return "Hare {" +
                " size = " + getSize() +
                ", color = '" + getColor() + '\'' +
                ", canMove = " + canMove +
                '}';
    }
}
