package de.telran.lesson0228.Homework.Game;

public class RockScrissorsPaperGame {
    public static void main(String[] args) {
        Player player1 = new Player();
        ComputerPlayer computerPlayer1 = new ComputerPlayer();
        while (player1.getCountLosed() <= 3) {
            gameRound(player1, computerPlayer1);
        }

    }

    public static void gameRound(Player player1, ComputerPlayer computerPlayer1) {
        player1.makeRandomChoice();
        computerPlayer1.makeComputerRandomChoice();
        GameChoice choice1 = player1.getChoice();
        GameChoice choice2 = computerPlayer1.getChoice();

        if (choice1 == choice2) {
            System.out.println("No one wins: " + choice1 + " --- " + choice2);
        } else {
            if ((choice1.ordinal()+ 1) % 3 == choice2.ordinal()) {
                firstWins(player1, computerPlayer1);
            } else {
                secondWins(player1, computerPlayer1);
            }
            wins(player1, computerPlayer1);
        }
    }

    private static void firstWins(Player player1, ComputerPlayer computerPlayer1) {
        player1.setCountWins(player1.getCountWins() + 1);
        computerPlayer1.setCountLosed(computerPlayer1.getCountLosed() + 1);
        System.out.println("First wins: " + player1.getChoice() + " --- " + computerPlayer1.getChoice());
    }

    private static void secondWins(Player player1, ComputerPlayer computerPlayer1) {
        player1.setCountLosed(player1.getCountLosed() + 1);
        computerPlayer1.setCountWins(computerPlayer1.getCountWins() + 1);
        System.out.println("Second wins: " + player1.getChoice() + " --- " + computerPlayer1.getChoice());
    }

    private static void wins(Player player1, ComputerPlayer computerPlayer1) {
        System.out.println("Player1 hat wins :" + player1.getCountWins() + ", losed: " + player1.getCountLosed());
        System.out.println("Computer hat wins :" + computerPlayer1.getCountWins() + ", losed: " + computerPlayer1.getCountLosed());


    }
}

