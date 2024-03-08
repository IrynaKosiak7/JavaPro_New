package de.telran.lesson0304.Homework.Fairytale;

public class Egg{
  private String color;
  private int size;
    private Needle needle;

    public Egg(String color, int size, Needle needle) {
        this.color = color;
        this.size = size;
        this.needle = needle;
    }
    public Egg deepCopy() {
        Needle newNeedle = new Needle(needle.getLength(), needle.getColor());
        return new Egg( color, size, newNeedle);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public Needle getNeedle() {
        return needle;
    }

    public void setNeedle(Needle needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return "Egg{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", needle=" + needle +
                '}';
    }
}
