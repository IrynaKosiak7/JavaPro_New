package de.telran.lesson0219.house2;

public class Robot extends Creature implements Walk, CatchMouse {
    private static int robotCount = 0;
    private static final int ROBOT_DEFAULT_VERSION = 1;
    private String description;
    private int version;

    public Robot(String name, String description, int version) {
        super(name);
        this.description = description;
        this.version = version;
        robotCount++;
    }

    public void sayHello() {
        System.out.println(" I'm robot. My name is " + getName());
    }

    public static void printTotalRobotCount() {
//        System.out.println(this.name); impossible
        System.out.println("Total robot number = " + robotCount);
    }

    public void printCurrentRobotInfo() {
        System.out.println(getName() + ", description: " + description + ", version: " + version);
        System.out.println("Total robot number = " + robotCount);
    }

    public void play(Creature another) {
        System.out.println(getName() + " chase " + another.getClass().getSimpleName());
    }

    public void walk(Animal animal) {
        System.out.println("Robot " + getName() + " walks with " + animal.getClass().getSimpleName() + " - " + animal.getName());
    }

    public void catchMouse(Mouse mouse) {
        System.out.println("I " + getName() + " catch " + mouse.getName());
    }
}