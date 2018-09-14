package game;

import game.api.Move;
import game.api.Player;
import game.api.VisibleGameState;

public class DummyPlayer implements Player {
    @Override
    public Move choice(VisibleGameState gameState) {
        return Move.RIGHT;
    }
}
