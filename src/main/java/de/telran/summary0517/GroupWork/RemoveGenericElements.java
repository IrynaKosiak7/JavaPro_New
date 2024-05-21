package de.telran.summary0517.GroupWork;

import java.util.Arrays;

public class RemoveGenericElements {
    public static void main(String[] args) {
        int[] array = {0, 3, -2, 4, 3, 2};
        System.out.println(Arrays.toString(getArrayWithoutGenericElements(array)));

    }

    public static int[] getArrayWithoutGenericElements(int[] array) {
        return Arrays.stream(array).distinct().toArray();

    }
}
