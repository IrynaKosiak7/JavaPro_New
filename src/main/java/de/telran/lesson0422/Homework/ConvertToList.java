package de.telran.lesson0422.Homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ConvertToList {
    public static void main(String[] args) {
      List<Optional<String>> list = Arrays.asList(Optional.of("A"), Optional.of("B"), Optional.empty());
      System.out.println(list);
//      Преобразовать в List

        List<String> collect = list.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(collect);


    }
}
