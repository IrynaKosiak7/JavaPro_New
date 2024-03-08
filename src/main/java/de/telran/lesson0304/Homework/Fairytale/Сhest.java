package de.telran.lesson0304.Homework.Fairytale;

public class Сhest{
    private int size;
    private String color;
    private Hare hare;

    public Сhest(int size, String color) {
        this.size = size;
        this.color = color;
    }
    public Сhest(int size, String color, Hare hare) {
        this.size = size;
        this.color = color;
        this.hare = hare;
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
        this.hare = null;
    }

    public Сhest shallowCopy() {
        return new Сhest(size, color, hare);
    }

    public Сhest deepCopy() {
        Hare newHare = new Hare(hare.getColor(), hare.isCanMove(), hare.getDuck());
        return new Сhest(size, color, newHare);
    }

    public Hare getHare() {
        return hare;
    }

    public void setHare(Hare hare) {
        this.hare = hare;
    }


    @Override
    public String toString() {
        return "Сhest {" +
                "size = " + size +
                ", color = " + color +
                ", hare = " + hare + '\'' +
                '}';
    }
}
