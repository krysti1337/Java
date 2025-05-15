import java.util.Arrays;

/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        Solution solution = new Solution();

        solution.rotate(nums, k);

    }
}

class Solution {
    public void rotate(int[] nums, int k) {

        if (k < 1) {
            System.out.println(nums);
        } else {
            while (k > 0) {

                int last = nums[nums.length - 1];

                for (int i = nums.length - 1; i > 0; i--) {
                    nums[i] = nums[i - 1];
                }

                nums[0] = last;
                k--;
            }
        }


        System.out.println(Arrays.toString(nums));
    }
}