package de.telran.lesson0417.homework;

import de.telran.lesson0219.house.Cat;
import de.telran.lesson0318.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
//    1. С помощью стримов:
//    - Посчитать количество неповторяющихся слов в списке
        List<String> stringList = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Two", "Three", "Four");
        int count = (int) stringList.stream().distinct().count();
        System.out.println("количество неповторяющихся слов " + count);

//    - Посчитать количество людей с именем "Tom" в списке имен
        List<String> employees = List.of("Ivan", "Tom", "Olga", "Anna", "Inna", "Iryna", "Tom", "Maryna", "Tom", "Yulia");
        int countTomNameInList = (int) employees.stream().filter(name -> name.equals("Tom")).count();
        System.out.println("количество людей с именем \"Tom\" - " + countTomNameInList);

//    - Из списка имен вывести первое по алфавиту, предпоследнее по алфавиту
        String firstName = employees.stream().sorted().min(String::compareTo).get();
        String lastName = employees.stream().sorted().max(String::compareTo).get();
        List<String> firstUndLastName = List.of(firstName, lastName);
        System.out.println(firstUndLastName);

//    - Посчитать количество чисел от 1 до 1000, которые делятся на 7.
        Integer countNumbers = (int) IntStream.range(0, 1000).filter(numb -> numb % 7 == 0).count();
        System.out.println("делятся на 7 - " + countNumbers);

//    - Посчитать сумму квадратов чисел от 1 до 100

        Integer sumSquare = IntStream.range(0, 100).reduce(0, (accumulator, element) -> (int) (accumulator + Math.pow(element, 2)));
        System.out.println("суммa квадратов чисел от 1 до 100 - " + sumSquare);

//    - Проверить, все ли числа из списка четные
        List<Integer> listInteger = List.of(1, 2, 3, 5, 7, 9, 4, 6);
        boolean isEven = listInteger.stream().allMatch(elem -> elem % 2 == 0);
        System.out.println("все ли числа из списка четные - " + isEven);

//Переписать через стримы фрагменты кода:
        List<String> strings = List.of("A", "B", "C", "D", "E", "W", "A", "B", "C", "D", "E", "W", "B", "C");
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println("----------");
        strings.stream().forEach(System.out::println);


        System.out.println("----------");
        System.out.println("method " + method(strings));

        System.out.println("methodWithStream - " + methodWithStream(strings));
    }

    public static List<String> method(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }

    public static List<String> methodWithStream(List<String> strings) {
        List<String> result = strings.stream().distinct().collect(Collectors.toList());
        return result;
    }

}
