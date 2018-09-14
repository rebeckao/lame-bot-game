package game;

public class DummyPlayer implements Player {
    @Override
    public Move choice(GameState gamestate) {
        return Move.RIGHT;
    }
}
