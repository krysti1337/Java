/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k,
and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 */
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Solution solution = new Solution();

        System.out.println(solution.threeSum(nums));
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left_pointer = i + 1;
            int right_pointer = nums.length - 1;
            while (left_pointer < right_pointer) {
                int sum = nums[i] + nums[left_pointer] + nums[right_pointer];
                if (sum > 0) {
                    right_pointer--;
                } else if (sum < 0) {
                    left_pointer++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[left_pointer], nums[right_pointer]));
                    left_pointer++;
                    right_pointer--;
                    while (left_pointer < right_pointer && nums[left_pointer] == nums[left_pointer - 1]) {
                        left_pointer++;
                    }
                }
            }
        }
        return res;
    }
}