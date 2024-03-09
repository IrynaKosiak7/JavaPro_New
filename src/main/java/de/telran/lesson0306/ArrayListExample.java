package de.telran.lesson0306;

import de.telran.lesson0304.Cat;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        String[] array = new String[3];
        array[0] = "A";
        array[1] = "B";
        array[2] = "C";
        System.out.println(Arrays.toString(array));

        Object[] objects = new Object[3];
        objects[0] = 1;
        objects[1] = "string";

        List<Object> objectList = new ArrayList();
        objectList.add(1);
        objectList.add("string");
        Object o1 = objectList.get(0);
        Object o2 = objectList.get(1);

        List<Double> doubleList = new ArrayList<>(5);
        doubleList.add(1.0);
        doubleList.add(2.0);
        doubleList.add(3.0);
        doubleList.add(4.0);
        doubleList.add(5.0);
        doubleList.add(6.0);
        System.out.println(doubleList);

        for (int i = 0; i < doubleList.size(); i++) {
            System.out.println(doubleList.get(i));
        }
        System.out.println("-----------");
        for (Double d : doubleList) {
            System.out.println(d);
        }
        Collections.reverse(doubleList);
        System.out.println(doubleList);


        List<Cat> catList = new ArrayList<>();

        List<String> textList = new ArrayList<>();
        textList.add("Java");
        textList.add("is");
        textList.add("the");
        textList.add("best");
        textList.add("programming");
        textList.add("language");

        System.out.println(textList.size());
        System.out.println(textList.isEmpty());
        System.out.println(textList.contains("the"));

        List<String> newList = Arrays.asList("A", "B", "C");
        textList.addAll(newList);
        System.out.println(textList);
textList.remove("A");
        System.out.println(textList);
//        ArrayList<String> newLink = (ArrayList<String>) textList;
//        newLink.trimToSize();
//        System.out.println(newList);

        //Cahslook
        for (int i = 0; i < textList.size(); i++) {
            textList.set(i, textList.get(i).toUpperCase(Locale.ROOT));
        }
        System.out.println(textList);

        //удаление четных чисел
        List<Double> newDouble = new ArrayList<>();
        for (Double d: doubleList) {
            if (d % 2 == 1) {
                newDouble.add(d);
            }
        }
        doubleList = newDouble;
        System.out.println(doubleList);

        //вернуть слово из 3 символов
        String world = null;
        for (String t: textList) {
            if (t.length() == 3) {
                world = t;
                break;
            }
        }
        System.out.println(world);


    }

}
