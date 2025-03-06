import java.sql.Array;
import java.util.Arrays;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] arr1 = {2, 5, 5, 11};
        int target1 = 10;

        Solution solution = new Solution();

        // System.out.println(Arrays.toString(solution.twoSum(arr, target)));
        System.out.println(Arrays.toString(solution.twoSum(arr1, target1)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    return new int[]{i, k};
                }
            }
        }
        return nums;
    }
}