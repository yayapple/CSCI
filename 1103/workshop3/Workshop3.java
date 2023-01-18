/*
 * Ethan Peterson
 * pet03320@umn.edu
 * 5623265
 */

public class Workshop3 {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = {};
        int[] nums3 = {-2, 1234, -601984, 0, 2};
        int[] nums4 = {1, 1, 2, 3, 4, 4, -1, 2, 7, 6, 3, 2, 4, 4, 1, -4, 10};

        System.out.println("PROBLEM 1: ADD ALL EVENS");
        System.out.println("test 1: " + (addAllEvens(nums1) == 30));
        System.out.println("test 2: " + (addAllEvens(nums2) == 0));
        System.out.println("test 3: " + (addAllEvens(nums3) == -600750));
        System.out.println();

        System.out.println("PROBLEM 2: ADD ALL EVEN INDICES");
        System.out.println("test 1: " + (addAllEvenIndices(nums1) == 25));
        System.out.println("test 2: " + (addAllEvenIndices(nums2) == 0));
        System.out.println("test 3: " + (addAllEvenIndices(nums3) == -601984));
        System.out.println();

        System.out.println("PROBLEM 3: SEARCH ARRAY");
        System.out.println("test 1: " + (searchArray(nums1, 10) == true));
        System.out.println("test 2: " + (searchArray(nums1, 11) == false));
        System.out.println("test 3: " + (searchArray(nums3, 0) == true)); 
        System.out.println();

        String[] strings1 = {"hello", "world", "foo", "bar"};
        String[] strings2 = {"", " ", "\n"};
        String[] strings3 = {"h", "hi", "hello", "hi", "hello", "hel", "", "llo", "hi"};

        System.out.println("PROBLEM 4: SEARCH ARRAY STRING");
        System.out.println("test 1: " + (searchArrString(strings1, "foo") == true));
        System.out.println("test 2: " + (searchArrString(strings1, "fo") == false));
        System.out.println("test 3: " + (searchArrString(strings2, null) == false));
        System.out.println("test 4: " + (searchArrString(strings2, "") == true));
        System.out.println("test 5: " + (searchArrString(strings3, "ello") == false));
        System.out.println();

        System.out.println("PROBLEM 5: COUNT SEARCH");
        System.out.println("test 1: " + (countSearch(nums4, 1) == 3));
        System.out.println("test 2: " + (countSearch(nums4, 100) == 0));
        System.out.println("test 3: " + (countSearch(nums4, 4) == 4));
        System.out.println("test 4: " + (countSearch(nums4, 3) == 2));

    }

    public static int addAllEvens(int[] nums) {

        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) sum += num;
        }
        return sum;
    }

    public static int addAllEvenIndices(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    public static boolean searchArray(int[] nums, int target) {

        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }

        return false;
    }

    public static boolean searchArrString(String[] arr, String target) {

        for (String s : arr) {
            if (s.equals(target)) {
                return true;
            }
        }

        return false;
    }

    public static int countSearch(int[] nums, int target) {

        int count = 0;
            for (int num : nums) {
                if (num == target) count++;
            }
        return count;
    }
}