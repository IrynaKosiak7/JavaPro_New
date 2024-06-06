package de.telran.lesson0603.homework;

import java.util.Scanner;

public class Crossbow {
    private final Object arrowsCome = new Object();
    private int arrows = 10;

    // When the arrows end, the wait() method is called and releases.
    synchronized public void fire() {
        while (true) {
            System.out.println("Write count arrows : ");
            for (int idx = arrows; idx >= 0; idx--) {
                if (idx != 0) {
                    System.out.println("The arrow is " + (arrows - idx + 1) + " right on the target!");
                } else {
                    System.out.println("The arrows are over");
                    arrows = 0;
                    System.out.println("Count arrows " + arrows);
                    synchronized (arrowsCome) {
                        try {
                            arrowsCome.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Carry a new quiver with arrows!!");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // reload() brings new arrows, calls the notify() method, which awakens the thread
    public void reload() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("New arrows on the way! Write count arrows: ");
            arrows = scanner.nextInt();
            System.out.println("Count arrows = " + arrows);
            synchronized (arrowsCome) {
                arrowsCome.notify();
            }
        }

    }

    public static void main(String[] args) {
        Crossbow crossbow = new Crossbow();

        Thread robinHood = new Thread(crossbow::fire);
        Thread servant = new Thread(crossbow::reload);

        robinHood.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        servant.start();
    }
}
