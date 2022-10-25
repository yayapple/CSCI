import java.util.ArrayList;

public class ArrayDrills {
	public static void main(String[] args) {
		System.out.println("Step 2");
		String[] myArray = {"Joe", "Mohamed", "Bill"};
		System.out.println("[Joe, Mohamed, Bill], Bill: " + (true == ArrayDrills.searchArray(myArray, "Bill")));
		System.out.println("[Joe, Mohamed, Bill], Ahmed: " + (false == ArrayDrills.searchArray(myArray, "Ahmed")));
		System.out.println();

		System.out.println("Step 3");
		String[] myArray2 = {"Joe", "Mohamed", "Bill", "Bill", "Shana", "Bill"};
		System.out.println("[Joe, Mohamed, Bill, Bill, Shana, Bill], Bill: " + (3 == ArrayDrills.countValues(myArray2, "Bill")));
		System.out.println();

		System.out.println("Step 4");
		int[] myArray3 = {1, 2, 3, 4, 5, 6, 7, 8, 10, 11};
		int[] myArray4 = {6, 7, 8, 9, 10, 11, 12, 13, 14}; 
		System.out.println("5 alike: " + (5 == ArrayDrills.countInBoth(myArray3, myArray4)));
		System.out.println();

		System.out.println("Step 5");
		int[] retArr = ArrayDrills.findInBoth(myArray3, myArray4);
        System.out.printf("length %d: ", retArr.length);
		for (int i : retArr) {
			System.out.print(i + " ");
		}
        System.out.println();

        int[] myArray5 = {1, 2, 3, 4, 5, 6};
        retArr = ArrayDrills.findInBoth(myArray5, myArray5);
        System.out.printf("length %d: ", retArr.length);
		for (int i : retArr) {
			System.out.print(i + " ");
		}
        System.out.println();

        int[] myArray6 = {1, 1, 2, 2, 3, 3, 1, 2, 3, 4, 4, 5, 1};
        int[] myArray7 = {5, 6, 7, 8, 1, 1, 1, 5};
        retArr = ArrayDrills.findInBoth(myArray6, myArray7);
        System.out.printf("length %d: ", retArr.length);
		for (int i : retArr) {
			System.out.print(i + " ");
		}
        System.out.println();

	}

	public static boolean searchArray(String[] myArr, String value) {
		for (String str : myArr) {
			if (str.equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	public static int countValues(String[] myArr, String value) {
		int count = 0;
		for (String str : myArr) {
			if (str.equals(value)) {
				count++;
			}
		}
		return count;
	}

	public static int countInBoth(int[] Arr1, int[] Arr2) {
		int count = 0;
		for (int i : Arr1) {
			for (int j: Arr2) {
				if (i == j) {
					count += 1;
					break;
				}
			}
		}
		return count;
	}

    public static int[] findInBoth(int[] Arr1, int[] Arr2) {
        int[] tempArr = new int[Arr1.length + Arr2.length];
        int len = 0; // to keep track of how many numbers in return array

        outer_loop: for (int i = 0; i < Arr1.length; i++) {
            for (int j = 0; j < len; j++) { // only loops over entries in tempArr
                if (Arr1[i] == tempArr[j]) continue outer_loop; // checks if the number is already in the array
            }
            for (int j : Arr2) {
                if (Arr1[i] == j) {
                    tempArr[len] = j;
                    len++;
                    continue outer_loop;
                }
            }
        }

        int[] retArr = new int[len];
        for (int i = 0; i < len; i++) retArr[i] = tempArr[i]; // remove 0s from array

        return retArr;

    }
}
