package de.telran.lesson0304.Homework.Fairytale;

public class Needle{
    private int length;
    private String color;

    public Needle(int length, String color) {
        this.length = length;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Needle{" +
                "length=" + length +
                ", color='" + color + '\'' +
                '}';
    }
}
