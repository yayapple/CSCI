import static java.util.Arrays.sort;

public class setOperations {
    public static void main(String[] args) {
        int[] retArr = new int[0];
        System.out.println("unionOp");
        int[] array1 = {1, 4, 7, 9};
        int[] array2 = {1, 2, 4, 12};

        retArr = unionOp(array1, array2);
        System.out.printf("length %d: ", retArr.length);
		for (int i : retArr) {
			System.out.print(i + " ");
		}
        System.out.println();

        System.out.println("intersectOp");
        retArr = intersectOp(array1, array2);
        System.out.printf("length %d: ", retArr.length);
		for (int i : retArr) {
			System.out.print(i + " ");
		}
        System.out.println();

        System.out.println("minusOp");
        retArr = minusOp(array1, array2);
        System.out.printf("length %d: ", retArr.length);
		for (int i : retArr) {
			System.out.print(i + " ");
		}
        System.out.println();
    }

    public static int[] unionOp(int[] array1, int[] array2) {
        int[] tempArr = new int[array1.length + array2.length];
        
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

        int[] retArr = new int[len];
        for (int i = 0; i < len; i++) retArr[i] = tempArr[i]; // remove 0s from array
        sort(retArr);
        return retArr;
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

        int[] retArr = new int[len];
        for (int i = 0; i < len; i++) retArr[i] = tempArr[i]; // remove 0s from array
        sort(retArr);
        return retArr;
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

        int[] retArr = new int[len];
        for (int i = 0; i < len; i++) retArr[i] = tempArr[i]; // remove 0s from array
        sort(retArr);
        return retArr;

    }
}