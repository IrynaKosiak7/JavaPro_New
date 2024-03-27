package de.telran.lesson0325.Homework;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueHomework {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(11);
        queue.add(10);
        queue.add(3);
        queue.add(9);
        queue.add(12);
        queue.add(1);
        System.out.println(queue);

        dequeQueue(queue);


    }

    public static void dequeQueue(Queue<Integer> queue) {
        Stack<Integer> stackQueue = new Stack<>();
        while (!queue.isEmpty()) {
            stackQueue.push(queue.poll());
        }
        while (!stackQueue.isEmpty()) {
            queue.offer(stackQueue.pop());
        }
        System.out.println(queue);

    }

}
