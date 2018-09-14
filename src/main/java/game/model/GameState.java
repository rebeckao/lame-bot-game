package game.model;

import game.api.Move;
import game.api.VisibleGameState;

import java.util.Arrays;
import java.util.List;

class GameState implements VisibleGameState {
    private Position goalposition = new Position(2, 0);
    private Position playerposition = new Position(0, 0);


    public Position getGoalposition() {
        return goalposition;
    }

    public Position getPlayerposition() {
        return playerposition;
    }

    void updateGameState(Move move) {

        switch (move) {
            case RIGHT:
                if (validatePlayerPosition(playerposition.x + 1, playerposition.y)) {
                    playerposition.x++;
                }
                break;
            case LEFT:
                if (validatePlayerPosition(playerposition.x - 1, playerposition.y)) {
                    playerposition.x--;
                }
                break;
            case UP:
                if (validatePlayerPosition(playerposition.x, playerposition.y - 1)) {
                    playerposition.y--;
                }
                break;
            case DOWN:
                if (validatePlayerPosition(playerposition.x, playerposition.y + 1)) {
                    playerposition.y++;
                }
                break;
        }
    }

    private boolean validatePlayerPosition(int x, int y) {
        return !isWallPosition(x, y) && x >= minx() && x <= maxx() && y >= miny() && y <= maxy();
    }

    private boolean isWallPosition(int x, int y) {
        return getWallpositions().contains(new Position(x, y));
    }

    boolean won() {
        return playerposition.equals(goalposition);
    }

    @Override
    public int minx() {
        return 0;
    }

    @Override
    public int maxx() {
        return 5;
    }

    @Override
    public int miny() {
        return 0;
    }

    @Override
    public int maxy() {
        return 5;
    }

    @Override
    public List<Position> getWallpositions() {
        return Arrays.asList(new Position(3,2),
                new Position(1,0),
                new Position(3, 3),
                new Position(2, 1));
    }
}
