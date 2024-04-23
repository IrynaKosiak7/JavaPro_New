package de.telran.lesson0422.Homework;


import de.telran.lesson0304.Cat;
import de.telran.lesson0318.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CatMap {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 2,"black" );
        Cat cat2 = new Cat("Mikky", 1,"white" );
        Cat cat3 = new Cat("Vasya", 3, "white");
        Cat cat4 = new Cat("Steve", 1, "grey");
        Cat cat5 = new Cat("Bob", 5,"black");
        List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat5);

//        Получить Map имя / цвет
        Map<String, String> nameToColor = catList.stream().collect(Collectors.toMap(Cat::getName, Cat::getColor));
        System.out.println(nameToColor);

//        Получить Map цвет / количество кошек данного цвета
        Map<String, Integer> colorToCount = catList.stream().collect(Collectors.toMap(Cat::getColor, count -> 1, (count1, count2) -> count1+ count2));
        System.out.println(colorToCount);

//        Получить Map> цвет / список имен кошек данного цвета
        Map<String, List<String>> colorToListName = catList.stream().collect(Collectors.groupingBy(Cat::getColor, Collectors.mapping(o -> o.getName(), Collectors.toList())));
        System.out.println(colorToListName);

//        Получить Map возраст / количество белых кошек данного возраста
        Map<Integer, Integer> colorToCountWhiteCats = catList.stream().filter(cat-> cat.getColor().equals("white")).collect(Collectors.toMap(Cat::getAge, count -> 1, (count1, count2) -> count1+ count2));
        System.out.println(colorToCountWhiteCats);

    }

}
