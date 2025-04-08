import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

 */
public class Main {
    public static void main(String[] args) {

        int [] nums = {3,2,3};

        Solution solution = new Solution();

        System.out.println(solution.majorityElement(nums));
    }
}

class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> count = new HashMap<>();

        for(int n: nums){
            count.put(n, count.getOrDefault(n, 0) +1);
        }

        int mostFrequent = 0;
        int maxCount = 0;
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }

        }
        return mostFrequent;
    }
}