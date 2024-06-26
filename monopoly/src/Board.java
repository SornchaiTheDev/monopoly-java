/**
 *  รหัสประจำตัวนิสิต 6510405814
 *  ชื่อ : Sornchai Somsakul
 */

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Square> squares;

    int PIECE_COUNT = 40;

    Board() {
        squares = new ArrayList<>();

        for (int i = 0; i < PIECE_COUNT; i++) {
            squares.add(new Square("Place " + i, i));
        }
    }

    public Square getSquare(Square oldLoc, int fvTotal) {
        return squares.get((oldLoc.getLocation() + fvTotal) % PIECE_COUNT);
    }

}
