package de.telran.lesson0320.Homework;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class HomeworkTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet1 = new TreeSet<>(Arrays.asList(11, 2, 3, 5, 1, 0, 7, 9, 10, 20, 6, 50, 18));
        System.out.println(treeSet1);

        System.out.println(treeSet1.contains(10));
        System.out.println(treeSet1.first());
        System.out.println(treeSet1.last());
        System.out.println(getTreeSetEven(treeSet1));
        System.out.println(treeSet1.reversed());
        System.out.println(treeSet1.headSet(7));

    }
        public static TreeSet<Integer> getTreeSetEven(TreeSet<Integer> treeSet){
        TreeSet<Integer> evenTreeSet = new TreeSet<>();
            for (Integer even: treeSet) {
                if ((even % 2) == 0) {
                    evenTreeSet.add(even);
                }
            }
            return evenTreeSet;
        }


}
