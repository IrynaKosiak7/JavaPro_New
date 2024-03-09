package de.telran.lesson0221;

public class CastExamples {
    public static void main(String[] args) {
        Object o = 10;
        Number n = 10;

        Object object = "String";

        object = new Child();
        object = "String value";
        object = 10.0;

        Double newLink = (Double) object;
        System.out.println(newLink);

        Integer integer =10;
        int intValue = 20;

        System.out.println((int)integer + intValue); //unboxing
        integer =(Integer) intValue;  //boxing

        Parents parents = new Parents();
        Child child = new Child();

        parents = child;
        child = (Child) parents;


    }
}
