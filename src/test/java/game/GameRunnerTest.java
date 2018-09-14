package game;

import game.api.GameRunner;
import game.api.Player;
import game.model.ConsoleGameRunner;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GameRunnerTest {
    private GameRunner gameRunner = new ConsoleGameRunner();
    private Player player = new DummyPlayer();

    @Test
    public void runGame() {
        boolean goalIsReached = gameRunner.runGame(player);
        assertTrue("Game Over!", goalIsReached);
    }
}