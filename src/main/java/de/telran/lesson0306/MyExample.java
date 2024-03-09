package de.telran.lesson0306;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class MyExample {
    public static void main(String[] args) {
        //1. У вас есть список значений int, вы должны вернуть список, каждое значение которого умножается на 2

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(15);
        arrayList.add(1);
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            int count = arrayList.get(i) * 2;
            arrayList.set(i, count);
        }
        System.out.println(arrayList);

//2.у вас есть список значений String, вы должны вернуть список этих значений без каких-либо дубликатов

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("world");
        strings.add("!!!");
        strings.add("Hello");
        strings.add("people");
        strings.add("!");
        System.out.println(strings);
        List<String> newList = removeDiplicates(strings);
        System.out.println(newList);


//3.у вас есть список значений String, вы должны вернуть одну строку, которая представляет собой конкатенацию всех значений.
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        for (String s: list) {
            System.out.print(s);
        }
        System.out.println( );


        //OR
        StringBuilder result = new StringBuilder();
        for (String m: list){
            result.append(m);
        }
        String stringResult = result.toString();
        System.out.println(stringResult);

        //4. Напишите метод для объединения двух списков в один общий ArrayList
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(5);
        arrayList1.add(10);
        arrayList1.add(15);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(15);
        arrayList2.add(1);

        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);






    }

    public static List<String> removeDiplicates(List<String> strings) {
        List<String> newStrings = new ArrayList<>();
        for (String s: strings) {
            if (!newStrings.contains(s)){
                newStrings.add(s);
            }
        }
        return newStrings;
    }

}
