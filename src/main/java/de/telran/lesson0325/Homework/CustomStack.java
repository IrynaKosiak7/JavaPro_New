package de.telran.lesson0325.Homework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class CustomStack {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,5,4,9,8,10));
        System.out.println(list);
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(5);
        integerStack.push(4);
        integerStack.push(9);
        integerStack.push(8);
        integerStack.push(10);
        System.out.println(integerStack);

        integerStack.pop();
        integerStack.pop();
        integerStack.pop();
        System.out.println(integerStack);

        integerStack.peek();
        integerStack.peek();
        integerStack.peek();
        integerStack.peek();
        integerStack.peek();
        integerStack.peek();
        integerStack.peek();
        integerStack.peek();
        integerStack.peek();
        System.out.println(integerStack);
    }



}
