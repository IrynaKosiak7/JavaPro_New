package de.telran.lesson0304.Homework.Fairytale;

public class Сhest {
    private int size;
    private String color;

    public Сhest(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void clear() {
        size = 0;
        color = null;
        if (this instanceof Hare) {
            ((Hare) this).setCanMove(false);
        }
    }

    public Сhest shallowCopy() {
        if  (this instanceof Hare) {
            return ((Hare) this);
        }
        return new Сhest(size, color);
    }

    public Сhest deepCopy() {
        if (this instanceof Hare) {
            return new Hare(size, color, ((Hare) this).isCanMove());
        }
        return new Сhest(size, color);
    }

    @Override
    public String toString() {
        return "Сhest {" +
                "size = " + size +
                ", color = '" + color + '\'' +
                '}';
    }
}
