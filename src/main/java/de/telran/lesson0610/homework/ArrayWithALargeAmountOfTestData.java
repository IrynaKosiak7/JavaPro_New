package de.telran.lesson0610.homework;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

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
        start = System.currentTimeMillis();
        long[] data = new long[]{100, 2000, 4, -5, 0, 1, 15, -2, 15, 200, 235, 2, 679, 89, 457, 111110000, 1254158, 154, 6, -64, 1000000000, 10000, 1877000000, 166666666, 1474154851, -1541584174, 1518741741, -2562586 - 226525999, -532832014, 2585412};
        Object[] result = LongStream.of(data).boxed().sorted().toArray();

        end = System.currentTimeMillis();
        System.out.println(Arrays.toString(result) + " sorted for " + (end - start) + " ms");


        data = new long[]{100, 2000, 4, -5, 0, 1, 15, -2, 15, 200, 235, 2, 679, 89, 457, 111110000, 1254158, 154, 6, -64, 1000000000, 10000, 1877000000, 166666666, 1474154851, -1541584174, 1518741741, -2562586 - 226525999, -532832014, 2585412};
        result = LongStream.of(data).parallel().boxed().sorted().toArray();

        end = System.currentTimeMillis();
        System.out.println(Arrays.toString(result) + " sorted in parallel for " + (end - start) + " ms");


    }

}
