package de.telran.lesson0304;

public class Box implements Cloneable{

    private String item;
    private int count;
    private boolean canBeSould;
    private Cat cat;

    public Box(String item, int count, boolean canBeSould, Cat cat) {
        this.item = item;
        this.count = count;
        this.canBeSould = canBeSould;
        this.cat = cat;
    }
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanBeSould() {
        return canBeSould;
    }

    public void setCanBeSould(boolean canBeSould) {
        this.canBeSould = canBeSould;
    }
    @Override
    public String toString() {
        return "Box{" +
                "item='" + item + '\'' +
                ", count=" + count +
                ", canBeSould=" + canBeSould +
                " cat " + cat +
                '}';
    }
    public void empty(){
        item = null;
        count = 0;
        canBeSould = false;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Box deepCope() {
        Cat newCat = new Cat(cat.getName(), cat.getCount(), cat.getColor());
        return new Box(item, count, canBeSould, newCat);
    }
    public Box shallowCopy(){
        return new Box(item, count, canBeSould, cat);
    }
    public Box clone() throws CloneNotSupportedException{
        Box cloned =(Box) super.clone();
        cloned.cat = cat.clone();
        return cloned;
    }
}
