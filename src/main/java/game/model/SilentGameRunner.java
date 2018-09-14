package game.model;

import game.api.GameRunner;
import game.api.Move;
import game.api.Player;

public class SilentGameRunner implements GameRunner {
    public boolean runGame(Player player) {
        GameState gameState = createInitialGameState();
        for (int i = 0; i < 5; i++) {
            Move move = player.choice(gameState);
            gameState.updateGameState(move);
        }
        return false;
    }

    private GameState createInitialGameState() {
        return new GameState();
    }
}
