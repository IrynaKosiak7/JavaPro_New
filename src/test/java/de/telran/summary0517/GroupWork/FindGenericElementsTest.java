package de.telran.summary0517.GroupWork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindGenericElementsTest {
    @Test
    public void normalFunctionWithForTest(){
        int[] arr1 = new int[]{1, 2, 5, 5, 8, 9, 7, 10};
        int[] arr2 = new int[]{1, 0, 6, 15, 6, 4, 7, 0};

        int[] expected = {1,7};

        int[] actual = FindGenericElements.getGenericElementsWithFor(arr1,arr2);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void negativeNumbersInMethodWithForTest(){
        int[] arr1 = new int[]{-1, -2, 5, -5, 8, 9, -7, 10};
        int[] arr2 = new int[]{1, 0,-2, 6, 15, 6, 4, -7, 10};

        int[] expected = {-2,-7, 10};

        int[] actual = FindGenericElements.getGenericElementsWithFor(arr1,arr2);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void arrayIsEmptyWithForTest(){
        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{};

        int[] expected = {};

        int[] actual = FindGenericElements.getGenericElementsWithFor(arr1,arr2);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void getGenericsElementsWithForTest(){
        int[] arr1 = new int[]{9,9,9,9,9,9,9,9};
        int[] arr2 = new int[]{9,9,9,9,9,9,9,9};

        int[] expected = {9};

        int[] actual = FindGenericElements.getGenericElementsWithFor(arr1,arr2);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void anotherLengthWithForTest(){
        int[] arr1 = new int[]{1, -2, 5, -5, 8, 4};
        int[] arr2 = new int[]{1, 0,-2, 6, 15, 6, 4, -7};

        int[] expected = {1,-2, 4};

        int[] actual = FindGenericElements.getGenericElementsWithFor(arr1,arr2);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void oneArrayIsEmptyWithForTest(){
        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{1, 0,-2, 6, 15, 6, 4, -7};

        int[] expected = {};

        int[] actual = FindGenericElements.getGenericElementsWithFor(arr1,arr2);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void twoArrayIsEmptyWithForTest(){
        int[] arr1 = new int[]{1, 0,-2, 6, 15, 6, 4, -7};
        int[] arr2 = new int[]{};

        int[] expected = {};

        int[] actual = FindGenericElements.getGenericElementsWithFor(arr1,arr2);

        Assertions.assertArrayEquals(expected, actual);
    }

//   With Set
    @Test
    public void normalFunctionWithSetTest(){
        int[] arr1 = new int[]{1, 2, 5, 5, 8, 9, 7, 10};
        int[] arr2 = new int[]{1, 0, 6, 15, 6, 4, 7, 0};

        int[] expected = {1,7};

        int[] actual = FindGenericElements.getGenericElementsWithSet(arr1,arr2);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void negativeNumbersInMethodWithSetTest(){
        int[] arr1 = new int[]{-1, -2, 5, -5, 8, 9, -7, 10};
        int[] arr2 = new int[]{1, 0,-2, 6, 15, 6, 4, -7, 10};

        int[] expected = {-2,-7, 10};

        int[] actual = FindGenericElements.getGenericElementsWithSet(arr1,arr2);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void arrayIsEmptyWithSetTest(){
        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{};

        int[] expected = {};

        int[] actual = FindGenericElements.getGenericElementsWithSet(arr1,arr2);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void getGenericsElementsWithSetTest(){
        int[] arr1 = new int[]{9,9,9,9,9,9,9,9};
        int[] arr2 = new int[]{9,9,9,9,9,9,9,9};

        int[] expected = {9};

        int[] actual = FindGenericElements.getGenericElementsWithSet(arr1,arr2);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void anotherLengthWithSetTest(){
        int[] arr1 = new int[]{1, -2, 5, -5, 8, 4};
        int[] arr2 = new int[]{1, 0,-2, 6, 15, 6, 4, -7};

        int[] expected = {1,-2, 4};

        int[] actual = FindGenericElements.getGenericElementsWithSet(arr1,arr2);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void oneArrayIsEmptyWithSetTest(){
        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{1, 0,-2, 6, 15, 6, 4, -7};

        int[] expected = {};

        int[] actual = FindGenericElements.getGenericElementsWithSet(arr1,arr2);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void twoArrayIsEmptyWithSetTest(){
        int[] arr1 = new int[]{1, 0,-2, 6, 15, 6, 4, -7};
        int[] arr2 = new int[]{};

        int[] expected = {};

        int[] actual = FindGenericElements.getGenericElementsWithSet(arr1,arr2);

        Assertions.assertArrayEquals(expected, actual);
    }

}