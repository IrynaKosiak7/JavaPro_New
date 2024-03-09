package de.telran.lesson0306.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraysList {
    public static void main(String[] args) {
        //    1. У вас есть список значений String, вы должны вернуть список количества символов этих String
        List<String> textList = new ArrayList<>();
        textList.add("Java");
        textList.add("is");
        textList.add("the");
        textList.add("best");
        textList.add("programming");
        textList.add("language");

        List<Integer> newTextList = new ArrayList<>();
        for (String s: textList){
            newTextList.add(s.length());
        }
        System.out.println(newTextList);

//    2. у вас есть список значений String, вы должны вернуть список со всеми значениями String более трех символов
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("is");
        arrayList.add("the");
        arrayList.add("best");
        arrayList.add("in");
        arrayList.add("programmirung");
        arrayList.add(", ");
        arrayList.add("or");
        arrayList.add("?");

        List<String> word = new ArrayList<>();
        for (String t: arrayList) {
            if (t.length() > 3) {
                word.add(t);
            }
        }
        System.out.println(word);

//   3.  у вас есть список значений Integer, вы должны вернуть их сумму
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        arrayListInteger.add(1);
        arrayListInteger.add(51);
        arrayListInteger.add(10);
        arrayListInteger.add(35);
        arrayListInteger.add(2);
        arrayListInteger.add(3);
        arrayListInteger.add(15);
        arrayListInteger.add(1);

        int sum = 0;
        for (Integer i: arrayListInteger){
            sum+=i;
        }
        System.out.println(sum);
//   4. у вас есть список значений Integer, вы должны вернуть их максимум
        int max = 0;
        for (Integer i: arrayListInteger) {
            if (i.intValue() > max) {
                max = i;
            }
        }
        System.out.println("максимум значений Integer "+max);

//   5. у вас есть список String, вы должны вернуть максимальную длину String
        int maximalArray = 0;
        for (String t: arrayList) {
            if (t.length() > maximalArray) {
                maximalArray = t.length();
            }
        }
        System.out.println("maximalArray "+ maximalArray);
//   6. Написать метод, который проверяет, является ли список Integer отсортированным.

        System.out.println( isSorted(arrayListInteger));

        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);
        array1.add(5);
        array1.add(6);
        array1.add(7);
        System.out.println(array1);

        System.out.println("it's new array: " + isSorted(array1));
//   7. Написать метод, который выдает из исходного списка список всех значений, делящихся на заданное число q.
        System.out.println(arrayListInteger);
        System.out.println("q: 5 - "+ getListDividedByAGivenNumber(arrayListInteger,5));
        System.out.println("q: 2 - " + getListDividedByAGivenNumber(arrayListInteger,2));
        System.out.println("q: 10 - " + getListDividedByAGivenNumber(arrayListInteger,10));

    }
    private static boolean isSorted(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i-1) > arr.get(i)) {
                return false;
            }
        }
        return true;
    }
    private static ArrayList<Integer> getListDividedByAGivenNumber(ArrayList<Integer> array, int q){
       List<Integer> arrays = new ArrayList<>();
        for (Integer i: array) {
            if (i.intValue() % q == 0) {
                arrays.add(i);
            }
        }
        return (ArrayList<Integer>) arrays;
    }
}
