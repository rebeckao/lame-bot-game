package game;

import game.api.GameRunner;
import game.model.ConsoleGameRunner;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GameRunnerTest {
    private GameRunner gameRunner = new ConsoleGameRunner();

    @Test
    public void runGameWithDummyPlayer() {
        boolean goalIsReached = gameRunner.runGame(new DummyPlayer());
        assertTrue("Game Over!", goalIsReached);
    }
}