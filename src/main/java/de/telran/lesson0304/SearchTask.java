package de.telran.lesson0304;

import java.util.Arrays;

public class SearchTask {
    public static void main(String[] args) {
        String[] data ={"A", "B", "D" , "F", "Hello", "World","!!", "cat", "Cat"};
//        isPresent(data, "B");
        System.out.println(findIndex(data, "G"));
        System.out.println(findIndex(data, "b"));
        int[]sorteData = {2, 4, 6, 9, 20};
        System.out.println(findIndexBinarySearch(sorteData, 9));
        System.out.println(Arrays.binarySearch(sorteData,5));

        int[]dataArray = {2,6,1,0};
        int[]copied =Arrays.copyOf(dataArray, dataArray.length+1);
        System.out.println(Arrays.toString(copied));

        String[] newArray = new String[5];
        Arrays.fill(newArray, "Value");
        System.out.println(Arrays.toString(newArray));

        Arrays.sort(dataArray); //quick sort alg
        System.out.println(Arrays.toString(dataArray));

        Arrays.sort(data); //merge sort alg
        System.out.println(Arrays.toString(data));

    }

    private static Object findIndexBinarySearch(int[] sorteData, int element) {
        return 0;
    }

    private static int findIndex(String[] data, String element) {
        for (int i = 0; i < data.length ; i++) {
            if (data[i].equalsIgnoreCase(element)) {
                return i;
            }
        }

        return -1;

    }
}
