package de.telran.lesson0304.Homework.Fairytale;

public class Fairytale {
    public static void main(String[] args) {
        Needle needle = new Needle(1, "silver");
        Egg egg = new Egg( "white", 2, needle);
        Duck duch = new Duck( "brown with white blemishes", false, egg);
        Hare hare = new Hare("brown",  true, duch);
        Сhest chest = new Сhest(10, "brown", hare);




        System.out.println(chest);
        System.out.println(hare);
        System.out.println(duch);
        System.out.println(egg);
        System.out.println(needle);

        chest.clear();
        System.out.println(chest);

        System.out.println("---------------------");
        Needle needle1 = new Needle(2, "gold");
        Egg egg1 = new Egg("brown", 7, needle1);
        Duck duck1 = new Duck("brown ", true, egg1);
        Hare hare1 = new Hare( "white", false, duck1);
        Сhest chest1 = new Сhest(15, "black",hare1);

        System.out.println(duck1.deepCopy());
        System.out.println("New Chest: " + chest1.shallowCopy());
        System.out.println("New chest deep copy: " + chest1.deepCopy());
        System.out.println(chest1);






    }
}
