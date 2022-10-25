import static java.util.Arrays.sort;
public class Pairs {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 4};
        int[] arr2 = {3, 2};
        int[] retArr = sumPairs(arr1, arr2);
        System.out.printf("length %d: ", retArr.length);
		for (int i : retArr) {
			System.out.print(i + " ");
		}
        System.out.println();

    }

    public static int[] sumPairs(int[] array1, int[] array2) {

        int[] retArr = new int[array1.length * array2.length];
        int index = 0;
        for (int i : array1) {
            for (int j : array2) {
                retArr[index] = i * j;
                index++;
            }
        }
        sort(retArr);
        return retArr;
    }
}