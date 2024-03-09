package de.telran.lesson0226.polimorfism;

public class Lamp implements  Switchable{
    private boolean isOn;

    public void on(boolean on) {
        isOn = on;
    }

    public void checkState() {
        System.out.println("Lamp is on " + ((isOn) ? "on" : "off"));
    }
}
