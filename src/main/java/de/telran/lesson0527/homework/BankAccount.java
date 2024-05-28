package de.telran.lesson0527.homework;

public class BankAccount {
    //    Имеется счет BankAccount, на котором хранится определенная сумма денег int sum.
//    Реализовать потокобезопасный метод пополнения счета - deposit(int amount),
//    снятия со счета - withdraw(int amount).
    private int sum;

    public BankAccount(int sum) {
        this.sum = sum;
    }

    public synchronized int getBalance() {
        return sum;
    }


    public synchronized void deposit(int amount) {
        if (amount > 0) {
            sum+= amount;
            System.out.println("Your account top up " + amount + ", now is your balance: " + sum);
        }
    }

    public synchronized void withdraw(int amount) {
        if (sum != 0 && amount <= sum) {
            sum-= amount;
            System.out.println("You withdraw " + amount + ", now is your balance:" + sum);
        } else {
            System.out.println("It's not impossible");
        }

    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1200);
        myAccount.deposit(100);
        myAccount.withdraw(1500);
        System.out.println(myAccount.getBalance());

    }
}
