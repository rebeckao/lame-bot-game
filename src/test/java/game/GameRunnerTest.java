package game;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameRunnerTest {
    private GameRunner gameRunner = new GameRunner();
    private Player player = new DummyPlayer();

    @Test
    public void runGame() {
        boolean goalIsReached = gameRunner.runGame(player);
        assertTrue(goalIsReached);
    }
}