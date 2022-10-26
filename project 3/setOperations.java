import static java.util.Arrays.sort;

public class setOperations {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 7, 9};
        int[] array2 = {1, 2, 4, 12};

        System.out.println("unionOp");
        printArr(unionOp(array1, array2));

        System.out.println("intersectOp");
        printArr(intersectOp(array1, array2));

        System.out.println("minusOp");
        printArr(minusOp(array1, array2));
    }

    public static void printArr(int[] arr) {
        System.out.printf("length %d: [", arr.length);
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.printf("%d]%n%n", arr[arr.length-1]);
    }

    public static int[] unionOp(int[] array1, int[] array2) {
        int[] tempArr = new int[array1.length + array2.length];
        /* 
        could first combine both arrays, then only run loop once. 
        not much redundancy to reduce with only 2 arrays, however.

        int[] bothArr = new int[array1.length + array2.length]
        System.arraycopy(array1, 0, bothArr, 0, array1.length);
        System.arraycopy(array2, 0, bothArr, array1.length, array2.length);
        */
        int len = 0;
        outer_loop: for (int i : array1) { // add array 1 to union set.
            for (int j = 0 ; j < len; j++) {
                if (i == tempArr[j]) continue outer_loop;
            }
            tempArr[len] = i;
            len++;
        }

        outer_loop: for (int i : array2) { // add array 2 to union set.
            for (int j = 0 ; j < len; j++) {
                if (i == tempArr[j]) continue outer_loop;
            }
            tempArr[len] = i;
            len++;
        }

        return stripArr(tempArr, len);
    }

    public static int[] intersectOp(int[] array1, int[] array2) { // taken from lab 7 step 5
        int[] tempArr = new int[array1.length + array2.length];
        int len = 0; // to keep track of how many numbers in return array

        outer_loop: for (int i : array1) {
            for (int j = 0; j < len; j++) { // only loops over entries in tempArr
                if (i == tempArr[j]) continue outer_loop; // checks if the number is already in the array
            }
            for (int j : array2) {
                if (i == j) {
                    tempArr[len] = j;
                    len++;
                    continue outer_loop;
                }
            }
        }

        return stripArr(tempArr, len);
    }

    public static int[] minusOp(int[] array1, int[] array2) {
        int[] tempArr = new int[array1.length];
        int len = 0;

        outer_loop: for (int i : array1) {
            for (int j : array2) {
                if (i == j) continue outer_loop;
            }
            tempArr[len] = i;
            len++;
        }

        return stripArr(tempArr, len);
    }

    public static int[] stripArr(int[] arr, int len) { 
        // returns an array of length (len) containing the first (len) elements of (arr)

        int[] retArr = new int[len];
        for (int i = 0; i < len; i++) retArr[i] = arr[i];
        sort(retArr);
        return retArr;
    }
}