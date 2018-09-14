package game.model;

import game.api.Move;
import game.api.VisibleGameState;

class GameState implements VisibleGameState {
    private Position goalposition = new Position(2, 0);
    private Position playerposition = new Position(0, 0);

    void updateGameState(Move move) {

        switch (move) {
            case RIGHT:
                playerposition.x++;
                break;
            case LEFT:
                playerposition.x--;
                break;
            case UP:
                playerposition.y--;
                break;
            case DOWN:
                playerposition.y++;
                break;
        }
    }

    boolean won() {
        return playerposition.equals(goalposition);
    }
}
