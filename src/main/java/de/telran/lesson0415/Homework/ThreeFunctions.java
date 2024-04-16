package de.telran.lesson0415.Homework;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ThreeFunctions {
    public static void main(String[] args) {
        UnaryOperator<Integer> funct1 = int1 -> int1 * 10;
        Function<Integer, String> funct2 = s -> "<<" + s + ">>";
        Function<String, Integer> funct3 = String::length;

        Function<Integer, Integer> consistentlyFunction = funct1.andThen(funct2).andThen(funct3);
        System.out.println(consistentlyFunction.apply(777));

        Function<String, String> fuction = funct3.andThen(funct1).andThen(funct2);
        System.out.println(fuction.apply("Hello!"));


        BinaryOperator<Integer> sum = Integer::sum;
        List<Integer> listInteger = List.of(1,2,3,5,7,9,4,6);
        System.out.println(reduce(listInteger,sum,0));

        BinaryOperator<Integer> multiplication = (i, j) -> i*j;
        System.out.println(reduce(listInteger,multiplication,1));







    }
    public static Integer reduce(List<Integer> list, BinaryOperator<Integer> function, Integer basicValue){
       int result = basicValue;
        for (Integer item : list) {
            result = function.apply(result, item);
        }
        return result;
    }
}
