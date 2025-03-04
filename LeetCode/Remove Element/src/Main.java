import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       int[] nums = {3,2,2,3};
       int val = 3;
       int[] nums2 = {0,1,2,2,3,0,4,2};
       int val2 = 2;

       System.out.println(removeElement(nums, val));
       System.out.println(removeElement(nums2, val2));

    }

    /*
    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
    The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

    Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
    The remaining elements of nums are not important as well as the size of nums.
    Return k.
     */
    public static int removeElement(int[] nums, int val) {

        int k = 0; // Numărul de elemente diferite de val
        int newArrayIndex = 0;

        // Determinăm câte elemente sunt diferite de val
        for (int l = 0; l < nums.length; l++) {
            if (nums[l] != val) {
                k++;
            }
        }

        // Creăm un array nou cu acele elemente
        int[] new_arr = new int[k];

        // Populăm new_arr cu elementele dorite
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                new_arr[newArrayIndex] = nums[i];
                newArrayIndex++;
            }
        }

        // Copiem valorile din new_arr în nums (modificând efectiv nums)
        for (int i = 0; i < k; i++) {
            nums[i] = new_arr[i];
        }

        System.out.println(Arrays.toString(Arrays.copyOf(nums, k))); // Afișează doar primele k elemente
        return k;
    }

}

//class Solution{
//    public int removeElement(int[] nums, int val) {
//
//        int k = 0; //elementele care sunt diferite de val
//
//        int [] new_arr = new int[nums.length - 1];
//
//        for (int i = 0, j = 0; i < nums.length; i++){
//            if (nums[i] != val){
//                new_arr[k] = nums[i];
//                k++;
//            }
//        }
//
//        return -1;
//    }
//}