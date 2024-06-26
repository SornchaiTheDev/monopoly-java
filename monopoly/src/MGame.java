/**
 * รหัสประจำตัวนิสิต 6510405814
 * ชื่อ : Sornchai Somsakul
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MGame {
    private int roundCnt;
    private List<Player> players;
    private Board board;
    private List<Die> dice;

    MGame() {
        players = new ArrayList<>();
        roundCnt = 0;
        dice = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            dice.add(new Die());
        }

        board = new Board();
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player amount : ");
        int playerAmount = scanner.nextInt();

        if (playerAmount < 2 || playerAmount > 8) {
            throw new Error("Player need to between 2 and 8");
        }

        for (int player = 1; player <= playerAmount; player++) {
            this.players.add(new Player("Player " + player, board, dice));
        }

        System.out.print("Enter round amount : ");
        int roundAmount = scanner.nextInt();

        if (roundAmount < 1) {
            throw new Error("Round need to be at least 1 round");
        }

        for (int round = 0; round < roundAmount; round++) {
            System.out.println("ROUND : " + (round + 1));
            playRound();
            System.out.println("----------------");
        }

    }

    private void playRound() {
        for (Player currentPlayer : players) {
            currentPlayer.takeTurn();
            roundCnt++;
        }
    }
}
