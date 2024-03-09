package de.telran.lesson0219.house;

public class Robot {
    private static int robotCount = 0;
    private static final int ROBOT_DEFAULT_VERSION = 1;
    private String name;
    private String description;
    private int version;

    private Robot() {
    }

    public Robot(String name, String description, int version) {
        this.name = name;
        this.description = description;
        this.version = version;
        robotCount++;
    }

    public Robot(String name, String description) {
        this.name = name;
        this.description = description;
        this.version = ROBOT_DEFAULT_VERSION;
        robotCount++;
    }

    public static void printTotalRobotCount() {
        System.out.println("Total Robot number " + robotCount);
    }

    public void printCurrentRobotInfo() {
        System.out.println(name + "description" + description + "version " + version);
        System.out.println("Total Robot number: " + robotCount);
    }
}
