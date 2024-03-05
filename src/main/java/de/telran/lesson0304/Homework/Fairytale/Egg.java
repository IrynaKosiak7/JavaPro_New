package de.telran.lesson0304.Homework.Fairytale;

public class Egg extends Duck{
    public Egg(int size, String color, boolean canMove){
        super(size, color, canMove);
    }
    @Override
    public String toString() {
        return "Egg {" +
                " size = " + getSize() +
                ", color = '" + getColor() + '\'' +
                ", canMove = " + isCanMove() +
                '}';
    }

}
