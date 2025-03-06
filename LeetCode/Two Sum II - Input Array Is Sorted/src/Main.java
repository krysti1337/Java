import java.util.Arrays;

/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.
Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 */
public class Main {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int [] arr2 = {2,3,4};
        int [] arr3 = {5,25,75};


        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.twoSum(arr, 9)));
        //System.out.println(Arrays.toString(solution.twoSum(arr2, 6)));
        //System.out.println(Arrays.toString(solution.twoSum(arr3, 100)));

    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length == 2){
            return new int[] {1,2};
        }

        int p1 = 0;
        int p2 = numbers.length - 1;

        while (p1 < p2){
            int sum = numbers[p1] + numbers[p2];
            if(sum > target){
                p2--;
            }else if(sum < target){
                p1++;
            }else {
                return new int[]{p1 + 1, p2 + 1};
            }
        }

        return new int[]{-1,-1};
    }
}