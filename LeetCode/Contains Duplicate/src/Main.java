import java.util.Arrays;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true
 */
public class Main {
    public static void main(String[] args) {

        int [] arr = {1,2,3,1};
        int [] arr2 = {1,2,3,4};
        int [] arr3 = {1,1,1,3,3,4,3,2,4,2};


        Solution solution= new Solution();

        System.out.println(solution.containsDuplicate(arr));
        System.out.println(solution.containsDuplicate(arr2));
        System.out.println(solution.containsDuplicate(arr3));
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set_variable = new HashSet<>();

         for(int num : nums){
             if(set_variable.contains(num)){
                 return true;
             }
             set_variable.add(num);
         }
         return false;
    }
}