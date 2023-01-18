package lab10;


public class MiscMethods {
    public static int addMaxsMins(int[] a1, int[] a2) {
        // add the max and min values of the arrays and return this sum
        // the arrays will have at least one value on the array
        
        // not sure if this means to add the max and mins of both arrays,
        // or the max of one array and the min of another.
        // I did not attend this lab in person.

        int max1 = a1[0]; // init max and min to be first entry in list
        int min1 = a1[0];

        for (int i : a1) {
            if (i > max1) max1 = i;
            if (i < min1) min1 = i;
        }

        int max2 = a2[0];
        int min2 = a2[0];

        for (int i : a2) {
            if (i > max2) max2 = i;
            if (i < min2) min2 = i;
        }

        return max1 + min1 + max2 + min2;
    }

    public static int countOdds(int[] a1) {
        int count = 0;
        for (int i : a1) {
            if (i % 2 == 1) count++;
        }

        return count;
    }

    public static int[] createArray(int[] a1, int left, int right) {
        int length = (right - left) + 1;
        int[] retArr = new int[length];

        for (int i = 0; i < length; i++) {
            retArr[i] = a1[i + left];
        }

        return retArr;
    }

    public static boolean containsDup(int[] a1) {
        // could use java sets or something
        for (int i = 0; i < a1.length; i++) {
            for (int j = i + 1; j < a1.length; j++) { // only need to check j for after i, as j before i has already been checked for
                if (a1[i] == a1[j]) return true;
            }
        }
        
        return false;
    }
}
