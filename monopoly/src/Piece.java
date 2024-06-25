/**
 *  รหัสประจำตัวนิสิต 6510405814
 *  ชื่อ : Sornchai Somsakul
 */

public class Piece {
    private Square location;

    /**
     * นำ Piece ไปตั้งยังตำแหน่งเริ่มต้นของเกมส์
     */
    Piece() {
        location = new Square("Place " + 0, 0);
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square newLoc) {
        this.location = newLoc;
    }
}
