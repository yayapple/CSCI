package lab9;

public class TestRectangle {
    public static void main(String[] args) {

        System.out.println("testing rectangles");
        Rectangle rec1 = new Rectangle(); // rec1 has the width = 1 and length = 1
        Rectangle rec2 = new Rectangle(5, 6);
        System.out.println(rec2.compArea()); // This should print 30
        System.out.println(rec1.compPerimeter()); // This should print 4

        rec1.setLength(4);
        rec1.setWidth(22);

        System.out.println(rec1.compArea()); // should return 88

        System.out.printf("rec1: %s%n", rec1);

        System.out.println();

        System.out.println("testing ArrRectangles");
        ArrRectangles arr1 = new ArrRectangles(5); // test adding too many rectangles
        for (int i = 0; i < 6; i++) {
            System.out.printf("%nattempting to add rectangle %d: ", i+1);
            arr1.addRec(rec1);
        }

        ArrRectangles arr2 = new ArrRectangles(4); // test array with empty entries
        arr2.addRec(rec2);
        arr2.addRec(rec2);

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1.addWidths()); // 22 * 5 = 110
        System.out.println(arr2.addWidths()); // 5 * 2 = 10
        System.out.println(arr1.addLengths()); // 4 * 5 = 20
        System.out.println(arr1.findRectangle(rec2)); // should return false
        System.out.println(arr2.findRectangle(rec2)); // should return true

    }
}
