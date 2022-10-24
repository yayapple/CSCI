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
		for (int i : retArr) {
			System.out.println(i);
		}
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
		ArrayList<Integer> retArr = new ArrayList<Integer>();

		for (int i : Arr1) {
			for (int j : Arr2) {
				if (i == j) {
					retArr.add(i);
				}
			}
		}
		int[] intArr = new int[retArr.size()];
		for (int i = 0; i < retArr.size(); i++) {
			intArr[i] = retArr.get(i);
		}
		return intArr;
	}

}
