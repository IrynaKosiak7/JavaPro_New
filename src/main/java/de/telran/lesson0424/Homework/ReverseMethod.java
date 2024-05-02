package de.telran.lesson0424.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseMethod<T> {
    public static void main(String[] args) {
        List<Integer> listInteger = List.of(1, 2, 3, 5, 7, 9, 4, 6);
        System.out.println(listInteger);
        List<String> words = List.of("Hello", " World", "!!");
        System.out.println(words);
        reverseWithRecursion(listInteger);
        reverseWithRecursion(words);
//        System.out.println();
//        System.out.println(makeReversedList(words));

    }

    public static <T> void reverseWithRecursion(List<T> list) {
        List<T> newList = new ArrayList<>(list);
        Collections.reverse(newList);
        System.out.println(newList);
    }
}
