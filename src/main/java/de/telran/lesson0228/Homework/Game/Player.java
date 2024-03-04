package de.telran.lesson0228.Homework.Game;

import java.util.Scanner;

public class Player {
    private int countWins = 0;
    private int countLosed = 0;
    private GameChoice choice;

    public GameChoice makeRandomChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your choice!");
        int playerChoice = scanner.nextInt();

        if (playerChoice < 1 || playerChoice > 3) {
            System.out.println("Некорректный выбор. Попробуйте еще раз.");
            return null;
        }

        switch (playerChoice) {
            case 1:
                choice = GameChoice.ROCK;
                break;
            case 2:
                choice = GameChoice.SCISSORS;
                break;
            case 3:
                choice = GameChoice.PAPER;
                break;
            default:
                choice = null;
        }

        return choice;
    }

    public int getCountWins() {
        return countWins;
    }

    public void setCountWins(int countWins) {
        this.countWins = countWins;
    }

    public void setCountLosed(int countLosed) {
        this.countLosed = countLosed;
    }

    public int getCountLosed() {
        return countLosed;
    }

    public GameChoice getChoice() {
        return choice;
    }

    @Override
    public String toString() {
        return "Player{" +
                "countWins=" + countWins +
                ", countLosed=" + countLosed +
                ", choice=" + choice +
                '}';
    }
}
