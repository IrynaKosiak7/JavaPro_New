package de.telran.lesson0304;

public class ArraysExamples {
    public static void main(String[] args) {
//        int[] ints1= new int[10];
//        int ints2[]= new int[10];
//        int[] ints3= {1,2,3,4};
//        int[] ints4= new int[]{1,2,3,4};
//        var ints5 = new int[10];
//        var ints6 = new int[]{1,2,3,4};
//
//        System.out.println(ints1.getClass().getSimpleName());
//        for (int i = 0; i < ints6.length; i++) {
//            System.out.println(ints6[i]);
//        }
//        for (int value: ints6) {
//            System.out.println(value);
//        }
//        String[][] strings = new String[3][];
//        strings[0] = new String[]{"A", "B"};
//        strings[1]= new String[]{"C", "D", "E"};
//        strings[2]= new String[]{"F", "G", "H", "K", "L"};
//
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println("Retieving data from i = " + i);
//            for (int j = 0; j < strings[i].length ; j++) {
//                System.out.println(strings[i][j]);
//            }
//        }

        int[][] ints2DArray = new int[5][7];
        print2DArray(ints2DArray);
        System.out.println("------------------");
        ints2DArray [3][6] = 8;
        print2DArray(ints2DArray);


    }
    private static void print2DArray( int[][] ints2DArray){
        for (int i = 0; i < ints2DArray.length; i++) {
            for (int j = 0; j < ints2DArray[0].length; j++) {
                System.out.print(ints2DArray[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
