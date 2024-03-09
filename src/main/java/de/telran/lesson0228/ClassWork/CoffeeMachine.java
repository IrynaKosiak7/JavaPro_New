package de.telran.lesson0228.ClassWork;

public class CoffeeMachine {
    private double currentMoneyInMachine = 0;

    public static void main(String[] args) {
        Coffee coffee = Coffee.MACCHIATO;
        displayInfo(Coffee.MACCHIATO);
        Coffee coffee1 = Coffee.CAPPUCCINO;
        makeCoffee(coffee1, 3,0);
        makeCoffee(coffee, 1.2,1);
        makeCoffee(coffee,2,1.2);
        Coffee coffee3 = Coffee.AMERICANO;
        makeCoffee(coffee3, 2,0.3);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void displayInfo(Coffee coffee) {
        System.out.println(coffee);
    }

    public static double makeCoffee(Coffee coffee, double money, double currentMoneyInMachine) {
        currentMoneyInMachine+=money;
        if (currentMoneyInMachine > coffee.getPrice()) {
            double change = currentMoneyInMachine - coffee.getPrice();
            System.out.println("Ваша сдача " + Math.round(change) + ". Кофе готовится.");
        } else if (currentMoneyInMachine < coffee.getPrice()) {
            System.out.println("осталось доплатить " + Math.abs(currentMoneyInMachine - coffee.getPrice()));
        } else if (currentMoneyInMachine == coffee.getPrice()) {
            System.out.println("Кофе готовится.");
        }
        if (coffee == Coffee.CAPPUCCINO) {
            System.out.println("данного вида кофе нет.");
            return money;
        }
        return money;
    }


    public  void getMoneyBack(){
        System.out.println("Take your money " + currentMoneyInMachine);
        currentMoneyInMachine = 0;
    }
}
