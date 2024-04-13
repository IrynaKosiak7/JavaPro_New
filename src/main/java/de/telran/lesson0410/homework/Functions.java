package de.telran.lesson0410.homework;

import de.telran.lesson0304.Cat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functions {
    public static void main(String[] args) {
//        1. Создать Supplier randomJoke, который выдает пользователю случайный анекдот из заготовленного исходного списка анекдотов.

        Supplier<Joke> randomJoke = () -> {
            Joke[] jokes = Joke.values();
            Random random = new Random();
            return jokes[random.nextInt(jokes.length)];
        };
        System.out.println(randomJoke.get());

//        2. Создать Consumer, который принимает числа и печатает четные числа в поток System.out, а нечетные числа в System.err.
        System.out.println("Consumer for numbers list: ");
        Consumer<List<Integer>> printNumbers = list ->
        {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0) {
                    System.out.println(list.get(i));
                } else {
                    System.err.println(list.get(i));
                }
            }
        };

        List<Integer> list = new ArrayList<Integer>();
        list.add(21);
        list.add(11);
        list.add(12);
        list.add(10);
        list.add(13);
        list.add(17);
        list.add(30);
        printNumbers.accept(list);

//        3. Создать Predicate isWhiteCat, который проверяет, белого ли цвета кошка Cat.
        System.out.println("Predicate isWhiteCat: ");
        Cat cat1 = new Cat("Tom", 2, "white");
        Cat cat2 = new Cat("Tom", 2, "grey");
        Cat cat3 = new Cat("Tom", 2, "black");

        Predicate<Cat> isWhiteCat = (white) -> white.getColor() == "white";
        System.out.println(isWhiteCat.test(cat1));
        System.out.println(isWhiteCat.test(cat2));
        System.out.println(isWhiteCat.test(cat3));

//        4. Создать BiFunction, которая возводит первый аргумент типа int в степень второго аргумента типа int
        BiFunction<Integer, Integer, Integer> power = (x, y) -> (int) Math.pow(x, y);
        int result1 = power.apply(2, 5);
        int result2 = power.apply(-5, 3);
        int result3 = power.apply(10, 9);
        int result4 = power.apply(6, 5);
        System.out.println("BiFunction 2^5 -> " + result1);
        System.out.println("BiFunction -5^2 -> " + result2);
        System.out.println("BiFunction 10^3 -> " + result3);
        System.out.println("BiFunction 6^5 -> " + result4);


    }
}
