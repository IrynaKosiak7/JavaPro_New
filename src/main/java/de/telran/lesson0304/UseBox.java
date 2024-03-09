package de.telran.lesson0304;

public class UseBox {
    public static void main(String[] args) {
//        Box box = new Box("toy", 5, true);
//        System.out.println(box);
//        box.empty();
//        System.out.println(box);
//        String item = box.getItem();
//        System.out.println(item.toUpperCase());
//
//        String someData =getSomeData();
//        if (someData.length() != null && someData != null) {
//            System.out.println(someData.charAt(0));
//            //process data
//        } else {
//            //some other logic
//        }
//        int number = getSomeInt();
//        System.out.println(number);

        Cat cat = new Cat("Tom", 5, "black");
        Box box1 = new Box("toy", 5, true, cat);
        System.out.println(box1);
        Box newBoxShallowCopy = box1.shallowCopy();
        System.out.println("New Box: " + newBoxShallowCopy);

        newBoxShallowCopy.getCat().setName("Vasya");
        System.out.println("After changing name shallowCopy : ");
        System.out.println("New Box: " + newBoxShallowCopy);
        System.out.println(box1);
        System.out.println();

        Box newBoxDeepCope= box1.deepCope();
        newBoxDeepCope.getCat().setName("Alisa");
        System.out.println("After changing name deepCope : ");
        System.out.println("New Box: " + newBoxDeepCope);
        System.out.println(box1);
        System.out.println();

        try{
            Cat catClone = cat.clone();
            System.out.println(catClone);
        }catch(CloneNotSupportedException e){
            System.out.println("CloneNotSupportedException");
        }


        try{
            System.out.println("After changing name, deep clone:");
            Box boxClone = box1.clone();
            box1.getCat().setName("New name");
            System.out.println(box1);
            System.out.println(boxClone);
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException");
        }
    }
    public static String getSomeData(){
        return " sdfghjkl";
    }
    public static int getSomeInt(){
        return 24;
    }



}
