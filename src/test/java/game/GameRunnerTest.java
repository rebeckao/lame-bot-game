package game;

import game.api.GameRunner;
import game.api.Player;
import game.model.SilentGameRunner;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameRunnerTest {
    private GameRunner gameRunner = new SilentGameRunner();
    private Player player = new DummyPlayer();

    @Test
    public void runGame() {
        boolean goalIsReached = gameRunner.runGame(player);
        assertTrue(goalIsReached);
    }
}