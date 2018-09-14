package game.api;

import game.model.GameState;

public interface Player {
    public Move choice(GameState gamestate);
}
