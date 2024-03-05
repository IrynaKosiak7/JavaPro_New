package de.telran.lesson0304.Homework.Array;

import java.util.*;

public class DataReverse {
    public static void main(String[] args) {
        reverceArrayString();

        int[][] array = new int[3][4];
        transpose(array);
        System.out.println("--------");

        generateMatrix();
    }

    public static void reverceArrayString() {
        String[] data = {"One", "Two", "Three"};
        System.out.println("Original: " + Arrays.toString(data));
        String temp = data[0];
        data[0] = data[2];
        data[2] = temp;
        System.out.println("New data: " + Arrays.toString(data));

    }

    public static void transpose(int[][] array) {
        int number = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (number < 10) {
                    array[i][j] = number;
                    number++;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("--------");
        int[][] result = new int[array[0].length][array.length];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                result[i][j] = array[j][i];
                System.out.print(result[i][j] + " ");
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


