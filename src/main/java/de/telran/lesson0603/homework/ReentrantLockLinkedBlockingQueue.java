package de.telran.lesson0603.homework;
import java.util.ArrayDeque;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockLinkedBlockingQueue<T> {
    private ArrayDeque<T> queue = new ArrayDeque<>();
    private ReentrantLock lock = new ReentrantLock(true);

    private Condition condition = lock.newCondition();
    private int size;

    public ReentrantLockLinkedBlockingQueue(int size) {
        this.size = size;
    }

    public void put(T t) {
        lock.lock();
        try {
            if (queue.size()>= size){
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            queue.add(t);
            condition.signal();

        } finally {
            lock.unlock();
        }
    }

    public T take() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                condition.awaitUninterruptibly();
            }
            return queue.poll();
        } finally {
            lock.unlock();
        }
    }

    public int size() {
        lock.lock();
        try {
            return queue.size();
        } finally {
            lock.unlock();
        }
    }
}
