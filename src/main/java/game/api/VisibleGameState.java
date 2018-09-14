package game.api;

import game.model.Position;

import java.util.List;

public interface VisibleGameState {
    int minx();

    int maxx();

    int miny();

    int maxy();

    List<Position> getWallpositions();
}
