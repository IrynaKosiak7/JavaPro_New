package de.telran.summary0517.GroupWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveGenericElementsTest {
    @Test
    public void standardArrayTest(){
        int[] arr1 = new int[]{1, 2, 5, 5, 8, 9, 7, 10};

        int[] expected = {1, 2, 5, 8, 9, 7, 10};

        int[] actual = RemoveGenericElements.getArrayWithoutGenericElements(arr1);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void emptyArrayTest(){
        int[] arr1 = new int[0];

        int[] expected = new int[0];

        int[] actual = RemoveGenericElements.getArrayWithoutGenericElements(arr1);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void nullArrayTest(){
        int[] arr1 = null;

        int[] expected = new int[0];

        int[] actual = RemoveGenericElements.getArrayWithoutGenericElements(arr1);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void allElementsGenericInArrayTest(){
        int[] arr1 = new int[]{9,9,9,9,9,9,9,9,9,9};

        int[] expected = {9};

        int[] actual = RemoveGenericElements.getArrayWithoutGenericElements(arr1);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void negativeElementsInArrayTest(){
        int[] arr1 = new int[]{-1,-5,-5,-6,-8,-1, -3,-25};

        int[] expected = {-1,-5,-6,-8,-3,-25};

        int[] actual = RemoveGenericElements.getArrayWithoutGenericElements(arr1);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void allElementIsNullInArrayTest(){
        int[] arr1 = new int[]{0,0,0,0,0,0,0,0,0};

        int[] expected = {0};

        int[] actual = RemoveGenericElements.getArrayWithoutGenericElements(arr1);

        Assertions.assertArrayEquals(expected, actual);
    }

}