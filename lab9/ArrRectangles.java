package lab9;

import java.util.Arrays;

public class ArrRectangles {
    private Rectangle[] rectangles;
    private int count;

    public ArrRectangles(int sizeOfArray) {
        rectangles = new Rectangle[sizeOfArray];
        count = 0;
    }

    public void addRec(Rectangle r1) {
        if (count > rectangles.length - 1) {
            System.out.println("Cannot add rect to array");
            return;
        }
        rectangles[count] = r1;
        count++;
    }

    public int addWidths() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += rectangles[i].getWidth();
        }

        return sum;
    }

    public int addLengths() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += rectangles[i].getLength();
        }

        return sum;
    }

    public boolean findRectangle(Rectangle r1) {
        for (int i = 0; i < count; i++) {
            if (
                (rectangles[i].getLength() == r1.getLength()) && 
                (rectangles[i].getWidth() == r1.getWidth())
                ) {
                    return true;
            }
        }
        return false;
    }

    public String toString() {
        return Arrays.toString(rectangles);
    }
}