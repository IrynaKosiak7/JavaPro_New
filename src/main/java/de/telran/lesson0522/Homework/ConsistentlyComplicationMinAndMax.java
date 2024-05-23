package de.telran.lesson0522.Homework;

public class ConsistentlyComplicationMinAndMax {
    //    задача 1: посчитать количество целых чисел в диапазоне от Integer.MINVALUE до Integer.MAXVALUE,
//которые делятся на заданное целое число без остатка.
//Решить данную задачу последовательно и параллельно в нескольких потоках. Сравнить время выполнения.
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int number = 5;
        int count = 0;

        for (int i=Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            if (i % number == 0)
                count++;
        }
        long end = System.currentTimeMillis();
        System.out.println("count divisible by " + number + ": " + count + ", for ms -> " + (end- start));
//        count divisible by 5: 858993459, for ms -> 9469 429521641


    }
}
