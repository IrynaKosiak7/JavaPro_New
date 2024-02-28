package de.telran.lesson0219.house2;

public class House {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 1,"white", true);
        Cat cat2 = new Cat("Vasya", 2,"black", false);
        cat1.sayHello();
        cat2.sayHello();

//        System.out.println(cat1.isHungry());
//        cat1.feed();
//        System.out.println(cat1.isHungry());

//        Robot.printTotalRobotCount();
//
//        Robot robot1 = new Robot("Valuum cleaner", "Robot cleaner");
//        Robot robot2 = new Robot("Washing mashine", "Robot to wash something");
//        robot1.printCurrentRobotInfo();
//        robot2.printCurrentRobotInfo();
//
////        robot1.printTotalRobotCount();
////        robot2.printTotalRobotCount();
//        Robot.printTotalRobotCount();

        Dog dog = new Dog("Jack", 1,"grey", false);
        dog.bark();
        dog.sayHello();
//        dog.feed();

        Animal animal = dog;
        animal.displayAnimalInfo();
        animal = cat1;
        animal.displayAnimalInfo();

//        Animal animal = new Animal("Jack", "grey", 1);

        Human human = new Human("Harry" ,30);
//        human.feedAnimal(dog);
        human.feedAnimal(dog, cat1, cat2);
        human.walk(dog);
        human.walk(cat2);
        System.out.println("----------------");


        Robot robot= new Robot("Claus", "H124UZ",  124);
        robot.sayHello();
        System.out.println("----------------");

        robot.play(human);
        human.play(dog);
        cat1.play(dog);
        dog.play(human);
        cat2.play(dog);

        Cat blackCat = new BlackCat("Robert",5,"grey", true);
        blackCat.play(dog);

        System.out.println("----------------");

        human.grow();
        cat1.grow();
        dog.grow();
        cat2.grow();
        System.out.println("----------------");

        robot.walk(dog);
        Mouse mouse = new Mouse("Jerry", 1,"gray", true);
        cat2.catchMouse(mouse);
        robot.catchMouse(mouse);
    }


}
