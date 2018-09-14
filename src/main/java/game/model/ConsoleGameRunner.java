package game.model;

import game.api.GameRunner;
import game.api.Move;
import game.api.Player;

import java.util.List;

public class ConsoleGameRunner implements GameRunner {
    public boolean runGame(Player player) {
        GameState gameState = createInitialGameState();
        displayMap(gameState);
        for (int i = 0; i < 5; i++) {
            Move move = player.choice(gameState);
            gameState.updateGameState(move);
            displayMap(gameState);
            if (gameState.won()) {
                return true;
            }
        }
        return false;
    }

    private GameState createInitialGameState() {
        return new GameState();
    }

    private void displayMap(GameState gamestate) {
        Position playerposition = gamestate.getPlayerposition();
        Position goalposition = gamestate.getGoalposition();
        List<Position> wallpositions = gamestate.getWallpositions();
        for (int y = gamestate.miny(); y <= gamestate.maxy(); y++) {
            for (int x = gamestate.minx(); x <= gamestate.maxx(); x++) {
                Position currentPosition = new Position(x, y);
                if (currentPosition.equals(playerposition)) {
                    System.out.print("@");
                } else if (currentPosition.equals(goalposition)) {
                    System.out.print("X");
                } else if (wallpositions.contains(currentPosition)) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        System.out.flush();
        System.out.println();
    }
}
