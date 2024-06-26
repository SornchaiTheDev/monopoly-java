/**
 *  รหัสประจำตัวนิสิต 6510405814
 *  ชื่อ : Sornchai Somsakul
 */

import java.util.List;

public class Player {
    private String name;
    private Piece piece;
    private Board board;
    private List<Die> dice;

    /**
     * @param name - ชื่อของผู้เล่น
     * @param dice - เลือกที่จะรับลูกเต๋ามาจาก MGame เพราะ Monopoly จริง ๆ จะมีลูกเต่าแค่ 2 ลูกไม่ได้มีคนละ 2 ลูก
     * @param board - เลือกที่จะรับบอร์ดมาจาก MGame เพราะมีเพียง 1 บอร์ดในเกมส์
     */
    Player(String name, Board board, List<Die> dice) {
        this.name = name;
        piece = new Piece();
        this.board = board;
        this.dice = dice;
    }

    public void takeTurn() {
        int fvTot = 0;

        for (Die die : dice) {
            die.roll();
            int fv = die.getFaceValue();
            fvTot += fv;
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);

        System.out.println(name);
        System.out.println("Rolled : " + fvTot);
        System.out.println("- " + piece.getLocation().getName());
    }

    @Override
    public String toString() {
        return this.name;
    }
}
