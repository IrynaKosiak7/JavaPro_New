package de.telran.lesson0226.classrelation;

public class Egg {
    private Chicken chicken;
    public Egg(){
//        this.chicken = new Chicken();
    }
    public void setChicken(Chicken chicken){
        this.chicken = chicken;
    }
    public String toString(){
        return "Some egg";
    }
}
