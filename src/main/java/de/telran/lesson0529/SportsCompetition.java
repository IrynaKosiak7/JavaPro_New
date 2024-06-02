package de.telran.lesson0529;

import java.util.*;

public class SportsCompetition {
    // Спортивное соревнование. Бегут 3 бегуна. Каждый пробегает дистанцию за случайное время.
//Каждый бегун земеряет свой результат и сообщает его тренеру. В конце забега выводится информация о победителе.
//Реализовать данную модель с помощью запуска отдельных потоков. Бегуна представить через класс Runner implements Runnable.

    //    2.Добавить в логику бега на соревнованиях мост. Бегуны перебегают через него только по одному, остальные ждут своей очереди.
    private static Object bridge = new Object();
    private static List<Runner> result = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        Runner runner1 = new Runner("Patric");
        Runner runner2 = new Runner("Alex");
        Runner runner3 = new Runner("Dennis");
        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(runner2);
        Thread thread3 = new Thread(runner3);
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        printResults();

    }

    static class Runner implements Runnable {
        private String name;
        private long time;


        public Runner(String name) {
            this.name = name;
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        @Override
        public void run() {
            long start = System.currentTimeMillis();
            System.out.println(name + " starts running");
            Random random = new Random();
            try {
                Thread.sleep(10_000 + random.nextInt(10_000));
                runningOnTheBridge();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " ends running");
            long end = System.currentTimeMillis();
            setTime(end - start);
            System.out.println(name + " run for " + (getTime()) + " ms");
            synchronized (result){
                result.add(this);
            }
        }

        public void runningOnTheBridge() throws InterruptedException {
            synchronized (bridge) {
                long start = System.currentTimeMillis();
                System.out.println(name + " starts running on the bridge");
                Thread.sleep(5_000);
                long end = System.currentTimeMillis();
                long bridgeTime = end - start;
                System.out.println(name + " runs on the bridge for " + bridgeTime + " ms");
            }
        }

    }

    private static void printResults() {
        Collections.sort(result, Comparator.comparingLong(Runner::getTime));
        for (int i = 0; i < result.size(); i++) {
            Runner runner = result.get(i);
            System.out.println(runner.name + " runs for time " + runner.time + " and has position - " + (i+1));
        }

    }
}
