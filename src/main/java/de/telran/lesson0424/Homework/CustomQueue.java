package de.telran.lesson0424.Homework;

import java.util.ArrayDeque;

public class CustomQueue<T> {
    private ArrayDeque<T> deque = new ArrayDeque<>();


    public void enqueue(T data) {
        deque.add(data);
    }

    public T dequeue() {
        return deque.removeFirst();
    }

    public static void main(String[] args) {
        CustomQueue myQueue = new CustomQueue();
        myQueue.enqueue("A");
        myQueue.enqueue("B");
        myQueue.enqueue("C");
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(1.10);
        myQueue.enqueue(2.8);
        myQueue.enqueue(10.87);

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}
