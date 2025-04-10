/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.



Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3
 */
class Main {
    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 2, 2};
        int[] nums2 = {3, 1, 3, 4, 2};
        int[] nums3 = {4, 3, 1, 4, 2};
        int[] nums4 = {2, 1, 1};

        Solution solution = new Solution();

        System.out.println(solution.findDuplicate(nums));
        System.out.println(solution.findDuplicate(nums2));
        System.out.println(solution.findDuplicate(nums3));
        System.out.println(solution.findDuplicate(nums4));

    }
}

class Solution {
    public int findDuplicate(int[] nums) {
        int left_p = 0;
        int right_p = nums.length - 1;
        if (nums[left_p] == nums[right_p]) {
            return nums[left_p];
        }
        while (left_p != right_p) {
            int mid = left_p + (right_p - left_p) / 2;
            int count = 0;

            for (int num : nums) {
                if (num <= mid) {
                    count++;
                }
            }

            if (count > mid) {
                right_p = mid;
            } else {
                left_p = mid + 1;
            }
        }

        return left_p;

    }
}