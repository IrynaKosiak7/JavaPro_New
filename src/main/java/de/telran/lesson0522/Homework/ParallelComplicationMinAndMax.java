package de.telran.lesson0522.Homework;

public class ParallelComplicationMinAndMax {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Task task1 = new Task(Integer.MIN_VALUE, -214748, 5);
        Task task2 = new Task(-214748, -21, 5);
        Task task3 = new Task(-21, 124559, 5);
        Task task4 = new Task(124559, Integer.MAX_VALUE, 5);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int count = task1.primeCount + task2.primeCount + task3.primeCount + task4.primeCount;
        long end = System.currentTimeMillis();
        System.out.println("count divisible by " + task1.number + ": " + count + ", for ms -> " + (end - start));
//        count divisible by 5: 429521641, for ms -> 4787
    }

    static class Task implements Runnable {
        int start;
        int end;
        int number;
        int primeCount;

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                if (i % number == 0) {
                    primeCount++;
                }
            }
        }

        public Task(int start, int end, int number) {
            this.start = start;
            this.end = end;
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }

}
