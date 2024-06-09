package de.telran.lesson0605;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.SynchronousQueue;

public class CarProduction {
    // 1 thread ---> CarDetail
    // 2 thread ---> Wheel
    // 3 thread ---> 4 Wheel + 1 CarDetail = Car
    private static ArrayBlockingQueue<String> wheels = new ArrayBlockingQueue<String>(100);
    private static ArrayBlockingQueue<String> carDetails = new ArrayBlockingQueue<String>(20);
    private static Semaphore semaphore = new Semaphore(4);
    private static SynchronousQueue<Car> cars = new SynchronousQueue<Car>(true);

    static class CarBody implements Runnable {
        String detail;

        public String getDetail() {
            return detail;
        }

        public CarBody(String detail) {
            this.detail = detail;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println(Thread.currentThread().getName() + " make a detail");
                    Thread.sleep(10000);
                    carDetails.put(detail);
                    System.out.println(Thread.currentThread().getName() + " transfer detail and make new");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Wheel implements Runnable {
        String wheel;

        public Wheel(String wheel) {
            this.wheel = wheel;
        }

        @Override
        public String toString() {
            return "Wheel{" +
                    "wheel='" + wheel + '\'' +
                    '}';
        }

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println(Thread.currentThread().getName() + " make wheel");
                    Thread.sleep(5000);
                    for (int i = 0; i < 5; i++) {
                        wheels.add(wheel);
                    }
                    System.out.println("Queue has wheel");
                    System.out.println(Thread.currentThread().getName() + " transfer wheel");
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }


    static class Car implements Runnable {
        List<String> wheelsForCar;
        CarBody carDetail;

        public Car(List<String> wheelsForCar, CarBody carDetail) {
            this.wheelsForCar = wheelsForCar;
            this.carDetail = carDetail;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "wheelsForCar= " + wheelsForCar +
                    ", carDetail= " + carDetail + '\'' +
                    '}';
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " make an auto");
            try {
                cars.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class CarAssembler implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println(Thread.currentThread().getName() + " wait details...");
                try {
                    List<String> wheelsForCar = new ArrayList<>(4);
                    String wheel = wheels.take();
                    wheelsForCar.add(wheel);
                    wheelsForCar.add(wheel);
                    wheelsForCar.add(wheel);
                    wheelsForCar.add(wheel);


                    Car car = new Car(wheelsForCar, new CarBody(carDetails.take()));
                    cars.put(car);
                    Thread.sleep(20000);
                    System.out.println("Car assembled: " + car);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }


    }

    public static void main(String[] args) throws InterruptedException {
        Wheel wheel = null;
        List<String> wheels = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            wheel = new Wheel("wheel " + i);
            wheels.add(wheel.toString());
            new Thread(wheel).start();
        }
        CarBody carBody = new CarBody("detail");
        new Thread(carBody).start();
        new Thread(new CarAssembler(), "CarAssembler").start();

        Thread.sleep(40_000);

        new Thread(new Car(wheels, carBody), "Car").start();

    }
}
