package de.telran.lesson0304;

public class Cat implements Cloneable{
    private String name;
    private int count;
    private  String color;

    public Cat(String name, int count, String color) {
        this.name = name;
        this.count = count;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", color='" + color + '\'' +
                '}';
    }
    public Cat clone() throws CloneNotSupportedException{
        return (Cat) super.clone();
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Tom",2, "white");
        System.out.println(cat);
        try{
            Cat catClone = cat.clone();
            System.out.println(catClone);
        }catch(CloneNotSupportedException e){
            System.out.println("CloneNotSupportedException");
        }
    }
}
