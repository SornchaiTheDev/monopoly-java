/**
 *  รหัสประจำตัวนิสิต 6510405814
 *  ชื่อ : Sornchai Somsakul
 */

public class Die {
    private int faceValue;

    public void roll() {
        faceValue = (int) (Math.random() * 6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
