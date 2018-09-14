package game.model;

import game.api.Move;
import game.api.VisibleGameState;

class GameState implements VisibleGameState {
    private Position goalposition = new Position(2, 0);
    private Position playerposition = new Position(0, 0);

    void updateGameState(Move move) {

    }

    boolean won() {
        return playerposition.equals(goalposition);
    }
}
