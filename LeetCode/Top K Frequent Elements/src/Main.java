import java.util.*;

/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = {1,1,1,2,2,3};
        int[] nums2 = {1};

        System.out.println(Arrays.toString((solution.topKFrequent(nums, 2))));
        System.out.println(Arrays.toString((solution.topKFrequent(nums2, 1))));

    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for(int n : freq[i]){
                res[index++] = n;
                if(index == k ){
                    return res;
                }
            }
        }
        return res;
    }
}