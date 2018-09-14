package game;

import game.api.GameRunner;
import game.api.Move;
import game.api.Player;
import game.api.VisibleGameState;
import game.model.ConsoleGameRunner;

import java.util.Scanner;

public class ManualPlayer implements Player {
    @Override
    public Move choice(VisibleGameState gamestate) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            int move = reader.nextInt();
            switch (move) {
                case 8:
                    return Move.UP;
                case 2:
                    return Move.DOWN;
                case 4:
                    return Move.LEFT;
                case 6:
                    return Move.RIGHT;
                default:
            }
        }
    }

    public static void main(String[] args) {
        GameRunner runner = new ConsoleGameRunner();
        boolean wonGame = runner.runGame(new ManualPlayer());
        if (wonGame) {
            System.out.println("You are not worthless");
        } else {
            System.out.println("Game Over!");
        }
    }
}
