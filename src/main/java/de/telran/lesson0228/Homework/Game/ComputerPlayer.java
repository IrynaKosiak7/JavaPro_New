package de.telran.lesson0228.Homework.Game;

import java.util.Random;

public class ComputerPlayer {
    private int countWins=0;
    private int countLosed=0;
    private GameChoice choice;

    public void makeComputerRandomChoice(){
        Random random = new Random();
        choice = GameChoice.values()[random.nextInt(GameChoice.values().length)];
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

    public void setChoice(GameChoice choice) {
        this.choice = choice;
    }

    public int getCountLosed() {
        return countLosed;
    }

    public GameChoice getChoice() {
        return choice;
    }
    @Override
    public String toString() {
        return "Computer{" +
                "countWins=" + countWins +
                ", countLosed=" + countLosed +
                ", choice=" + choice +
                '}';
    }
}
