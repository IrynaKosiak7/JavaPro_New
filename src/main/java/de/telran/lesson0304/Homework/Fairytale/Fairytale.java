package de.telran.lesson0304.Homework.Fairytale;

public class Fairytale {
    public static void main(String[] args) {
        Сhest chest = new Сhest(10, "brown");
        Hare hare = new Hare(25, "grey", true);
        Duck duch = new Duck(20, "brown with white blemishes", true);
        Egg egg = new Egg(5, "white", false);
        Needle needle = new Needle(2, "silver", false);
        System.out.println(chest);
        System.out.println(hare);
        System.out.println(duch);
        System.out.println(egg);
        System.out.println(needle);

        chest.clear();
        System.out.println(chest);
        hare.clear();
        System.out.println(hare);
        duch.clear();
        System.out.println(duch);
        egg.clear();
        System.out.println(egg);
        needle.clear();
        System.out.println(needle);

        System.out.println("---------------------");
        Сhest chest1 = new Сhest(15, "black");
        Hare hare1 = new Hare(35, "white", false);
        Duck duch1 = new Duck(22, "brown ", true);
        Egg egg1 = new Egg(7, "brown", false);
        Needle needle1 = new Needle(1, "gold", false);
        System.out.println(chest1);
        System.out.println("New Chest: " + chest1.shallowCopy());
        System.out.println(hare1);
        System.out.println("New hare: " + hare1.shallowCopy());
        System.out.println("New hare deepCope : " + hare1.deepCopy());
        System.out.println(duch1);
        System.out.println("New duch1: " + duch1.shallowCopy());
        System.out.println("New duch1 deepCope : " + duch1.deepCopy());
        System.out.println(needle1);
        System.out.println("New needle1: " + needle1.shallowCopy());
        System.out.println("New needle1 deepCope : " + needle1.deepCopy());




    }
}
