package de.telran.summary0517.GroupWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class FindGenericElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
        System.out.println(Arrays.toString(getGenericElementsWithFor(array1, array2)));

        System.out.println(getGenericElementsWithSet(array1, array2));


    }

    public static int[] getGenericElementsWithFor(int[] array1, int[] array2) {
        if (array1 == null || array2 == null){
            return new int[0];
        }
        int[] array = new int[array2.length];
        int c = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    array[c] = array1[i];
                    c++;

                }
            }
        }
        return Arrays.copyOfRange(array, 0, c);
    }
    public static int[] getGenericElementsWithSet(int[] array1, int[] array2) {
        if (array1 == null || array2 == null){
            return new int[0];
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> collect = new HashSet<>();
        for (int numb: array1){
            set.add(numb);
        }
        for (int genElem: array2){
            if (set.contains(genElem)){
                collect.add(genElem);
            }
        }
        int[] result = new int[collect.size()];
        int index = 0;
        for (int num : collect) {
            result[index++] = num;
        }

        return result;

    }
}
