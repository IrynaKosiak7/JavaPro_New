package de.telran.lesson0219.house;

public class House {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murka", "black", 2);
        Cat cat2 = new Cat("Tom", "white", 1);
        cat1.sayHello();
        cat2.sayHello();

        System.out.println(cat1.isHungry());
        cat1.feed();
        System.out.println(cat1.isHungry());


        Robot robot1 = new Robot("Valum cleaner", "Robot cleaner", 1);
        Robot robot2 = new Robot("Washing mashine", "Robot to washing", 1);
        robot1.printCurrentRobotInfo();
        robot2.printCurrentRobotInfo();

//        robot1.printTotalRoboteCount();
//        robot2.printTotalRoboteCount();
        Robot.printTotalRobotCount();

    }

}
