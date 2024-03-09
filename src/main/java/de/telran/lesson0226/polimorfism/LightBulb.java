package de.telran.lesson0226.polimorfism;

public class LightBulb implements  Switchable{
    private  boolean isOn;
    @Override
    public void on(boolean on) {
        isOn = on;
    }

    @Override
    public void checkState() {
        System.out.println("Light Bulb is on " + ((isOn) ? "on" : "off"));
    }

}
