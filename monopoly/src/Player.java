/**
 *  รหัสประจำตัวนิสิต 6510405814
 *  ชื่อ : Sornchai Somsakul
 */

import java.util.List;

public class Player {
    private String name;
    private Piece piece;
    private Board board;

    Player(String name, Board board) {
        this.name = name;
        piece = new Piece();
        this.board = board;
    }

    /**
     * @param dice - เลือกที่จะรับลูกเต๋ามาจาก MGame เพราะ Monopoly จริง ๆ จะมีรูปเต่าแค่ 2 ลูกมไม่ได้มีคนละ 2 ลูก
     */
    public void takeTurn(List<Die> dice) {
        int fvTot = 0;

        for (Die die : dice) {
            die.roll();
            int fv = die.getFaceValue();
            fvTot += fv;
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);
    }

    public Piece getPiece() {
        return piece;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
