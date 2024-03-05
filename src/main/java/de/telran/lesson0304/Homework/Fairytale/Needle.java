package de.telran.lesson0304.Homework.Fairytale;

public class Needle extends  Egg{
    public Needle(int size, String color, boolean canMove){
        super(size, color, canMove);
    }
    @Override
    public String toString() {
        return "Needle {" +
                " size = " + getSize() +
                ", color = '" + getColor() + '\'' +
                ", canMove = " + isCanMove() +
                '}';
    }
}
