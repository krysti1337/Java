/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}};

        Solution solution = new Solution();

        System.out.println(solution.searchMatrix(matrix, 10));

    }
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        for(int i = 0; i < matrix.length; i ++){
            for (int j = 0; j < matrix[i].length; j++){
                int left_pointer = j;
                int right_pointer = matrix[i].length - 1;

                while (left_pointer <= right_pointer){

                    if(matrix[i][j] > target){
                        right_pointer --;
                    } else if(matrix[i][j] < target){
                        left_pointer ++;
                    } else {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}