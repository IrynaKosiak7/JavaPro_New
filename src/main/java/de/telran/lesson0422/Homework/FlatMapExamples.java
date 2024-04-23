package de.telran.lesson0422.Homework;

import java.util.Arrays;
import java.util.List;

public class FlatMapExamples {
    public static void main(String[] args) {
//        1. Имеется два списка элементов.
        List<Integer> list1 = Arrays.asList(1, 2, 3, 5, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 1);
//        С помощью flatmap:
//        a). Получить все возможные значения произведения чисел из обоих списков
        list1.stream().flatMap(elem1 ->list2.stream().map(elem2-> elem1*elem2)).forEach(System.out::println);

//        b). Получить все возможные повторяющиеся пары чисел из обоих списков [1, 1] [5, 5]
        Integer[][] array = list1.stream().flatMap(elem1 -> list2.stream().filter(elem1::equals).map(elem2 -> new Integer[]{elem1, elem2})).toArray(Integer[][]::new);
        System.out.println(Arrays.deepToString(array));


//        с). Найти все пары чисел, которые делятся друг на друга [2, 4] [3, 6] [5, 1]
        Integer[][] array2 = list1.stream().flatMap(elem1 -> list2.stream().filter(elem2 -> elem1 % elem2 == 0 ).map(elem2 -> new Integer[]{elem1, elem2})).toArray(Integer[][]::new);
        System.out.println(Arrays.deepToString(array2));






    }
}
