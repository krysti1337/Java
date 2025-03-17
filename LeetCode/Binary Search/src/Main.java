/*
Binary Search

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int[] nums2 = {5};
        int[] nums3 = {2, 5};

        System.out.println(solution.search(nums, target));
        System.out.println(solution.search(nums2, -5));
        System.out.println(solution.search(nums2, 5));
        System.out.println(solution.search(nums3, 5));
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int left_pointer = 0, right_pointer = nums.length - 1;

        while (left_pointer <= right_pointer) {
            int mid = left_pointer + (right_pointer - left_pointer) / 2;

            if(nums[mid] > target){
                right_pointer = mid - 1;
            } else if(nums[mid] < target){
                left_pointer = mid + 1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}



