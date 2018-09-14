package game;

import game.api.Move;
import game.api.Player;
import game.model.GameState;

public class DummyPlayer implements Player {
    @Override
    public Move choice(GameState gamestate) {
        return Move.RIGHT;
    }
}
