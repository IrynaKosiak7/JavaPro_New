package de.telran.lesson0304.Homework.Array;

import java.util.*;

public class DataReverse {
    public static void main(String[] args) {
        List<String> data = new ArrayList<String>();
        data.add("One");
        data.add("Two");
        data.add("Three");
        System.out.println(data);
        Collections.reverse(data);
        System.out.println("New data " + data);

        int[][] array = new int[3][4];
        arrayPrintForTranspose(fillingArray(array));
        System.out.println("--------");
        fillingArray(array);
        transpose(fillingArray(array));
        System.out.println("--------");

        generateMatrix();

    }

    public static int[][] transpose(int[][] array) {
        int[][] result = new int[array[0].length][array.length];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                result[i][j] = array[j][i];
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }
        return result;
    }

    public static int[][] fillingArray(int[][] array) {
        int number = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (number < 10) {
                    array[i][j] = number;
                    number++;
                }
            }
        }
        return array;
    }

    public static void arrayPrintForTranspose(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    private static int[][] generateMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write n: ");
        int n = scanner.nextInt();
        System.out.println("Write m: ");
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        if (n > 0 && m > 0) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (i == j) {
                        matrix[i][j] = 1;
                    }
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print("\n");
            }
        } else {
            System.out.println("error!");
        }
        return matrix;
    }
}


