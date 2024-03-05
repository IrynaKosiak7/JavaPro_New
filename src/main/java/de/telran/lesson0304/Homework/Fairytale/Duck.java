package de.telran.lesson0304.Homework.Fairytale;

public class Duck extends Hare{
public Duck(int size, String color, boolean canMove){
    super(size, color, canMove);
}
    @Override
    public String toString() {
        return "Duck {" +
                " size = " + getSize() +
                ", color = '" + getColor() + '\'' +
                ", canMove = " + isCanMove() +
                '}';
    }

}
