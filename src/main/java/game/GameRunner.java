package game;

public class GameRunner {
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
