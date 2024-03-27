package de.telran.lesson0325.Homework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetHomework {
    public static void main(String[] args) {
        Set<Integer> integerSet1 = new TreeSet<>();
        integerSet1.add(1);
        integerSet1.add(11);
        integerSet1.add(12);
        integerSet1.add(10);
        integerSet1.add(8);
        integerSet1.add(6);
        integerSet1.add(5);
        System.out.println(integerSet1);

        Set<Integer> integerSet2 = new TreeSet<>();
        integerSet2.add(2);
        integerSet2.add(12);
        integerSet2.add(16);
        integerSet2.add(3);
        integerSet2.add(9);
        integerSet2.add(10);
        System.out.println(integerSet2);

        Set<Integer> integerSetAll = new HashSet<>(integerSet1);
        integerSetAll.addAll(integerSet2);
        System.out.println(integerSetAll);

        Set<Integer> integerSetCommon = new HashSet<>(integerSet1);
        integerSetCommon.retainAll(integerSet2);
        System.out.println(integerSetCommon);

        Set<Integer> integerSetOnlyInSet1Elements = new HashSet<>(integerSet1);
        integerSetOnlyInSet1Elements.removeAll(integerSet2);
        System.out.println(integerSetOnlyInSet1Elements);


    }



}
