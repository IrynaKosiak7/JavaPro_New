package de.telran.lesson0226.classrelation;

public class Chicken {
    private  Egg egg;
    public Chicken(){
//        this.egg = new Egg();

    }
    public  void  setEgg(Egg egg){
        this.egg = egg;
    }

    public static void main(String[] args) {
        Chicken someChicken = new Chicken();
        Egg someEgg = new Egg();
        someChicken.setEgg(someEgg);
        someEgg.setChicken(someChicken);

        System.out.println(someChicken);
    }
    public String toString(){
        return "Chicken{ " +
                "egg= " +
                " }";
    }
}
