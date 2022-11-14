package lab10;

import java.util.Arrays;

public class TestMiscMethods {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7}; // 1 + 7 = 8
        int[] arr2 = {-10, -12, -13, 4, -12, -40, 31, -20}; // - 41 + 31 = -9

        System.out.println("Add maxs mins");
        int maxmins = MiscMethods.addMaxsMins(arr1, arr2); // should be -1
        System.out.println(maxmins);
        System.out.println();

        System.out.println("Count odds");
        int odds = MiscMethods.countOdds(arr1); // 4
        System.out.println(odds);
        System.out.println();

        System.out.println("Create Array");
        int[] arr3 = MiscMethods.createArray(arr2, 1, 5);
        System.out.println(Arrays.toString(arr3));
        System.out.println();

        System.out.println("Contains Dupe");
        System.out.println(MiscMethods.containsDup(arr1)); // false
        System.out.println(MiscMethods.containsDup(arr2)); // true
        
    }
}
