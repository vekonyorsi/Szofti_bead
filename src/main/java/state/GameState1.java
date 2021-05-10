package state;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class GameState1 {
    private static final int[] gyuru = {1, 5, 6, 4, 8, 6, 4, 3, 1, 2, 2, 8};

    @Setter(AccessLevel.PUBLIC)
    private Player player1;

    @Setter(AccessLevel.PUBLIC)
    private Player player2;

    @Getter(AccessLevel.PUBLIC)
    private Player winner;

    @Getter(AccessLevel.PUBLIC)
    private Player loser;

}
