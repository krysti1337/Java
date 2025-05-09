/*
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums2 = {1};

        Solution solution = new Solution();

        System.out.println(solution.search(nums, 0));
        System.out.println(solution.search(nums1, 3));
        System.out.println(solution.search(nums2, 1));
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int left_pointer = 0, right_pointer = nums.length - 1;

        while(left_pointer <= right_pointer) {

            int mid = (left_pointer + right_pointer) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left_pointer] <= nums[mid]) {
                if (target > nums[mid] || target < nums[left_pointer]) {
                    left_pointer = mid + 1;
                } else {
                    right_pointer = mid - 1;
                }
            } else {
                if (target < nums[mid] || target > nums [right_pointer]) {
                    right_pointer = mid - 1;
                } else {
                    left_pointer = mid + 1;
                }
            }

        }
        return -1;
    }
}

