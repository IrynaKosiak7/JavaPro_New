package de.telran.lesson0219.house2;

public class Robot extends  Creature{

    private static int robotCount = 0;

    private static final int ROBOT_DEFAULT_VERSION = 1;

    private String name = "Name";

    private String description;

    private int version;

    public Robot(String name, String description, int version) {
        this.name = name;
        this.description = description;
        this.version = version;
        robotCount++;
    }
    public void sayHello(){
        System.out.println(" I'm robot. My name is " + name);
    }

    public static void printTotalRobotCount(){
//        System.out.println(this.name); impossible
        System.out.println("Total robot number = " + robotCount);
    }

    public void printCurrentRobotInfo() {
        System.out.println(name + ", description: " + description + ", version: " + version);
        System.out.println("Total robot number = " + robotCount);
    }
    public void play(Creature another) {
        System.out.println(name + " chase "+ another.getClass().getSimpleName());
    }

}