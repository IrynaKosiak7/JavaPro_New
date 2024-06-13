package de.telran.lesson0610.homework;

import java.util.Arrays;
import java.util.Random;


public class ArrayWithALargeAmountOfTestData {
//  Составить массив с большим объемом тестовых данных. С помощью стримов отсортировать данные
//
//последовательно
//
//параллельно
//Замерить и сравнить затраченное время.

    public static void main(String[] args) {
        long start;
        long end;

        long[] data = new long[100_000_000];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextLong();
        }
        start = System.currentTimeMillis();
        Arrays.sort(data);
        end = System.currentTimeMillis();
        System.out.println("Sorted consecutive passage of time" + (end - start) + " ms");

        start = System.currentTimeMillis();
        Arrays.stream(data).parallel().sorted();
        end = System.currentTimeMillis();
        System.out.println("Sorted in parallel passage of time " + (end - start) + " ms");


    }

}
