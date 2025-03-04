import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.twoSum(nums, target)));

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        Solution2 solution2 = new Solution2();
        solution2.merge(nums1, m, nums2, n);

    }

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    solution[0] = i;
                    solution[1] = j;
                }
            }
        }
        return solution;
    }
}

class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int i = m + n - 1;

        while (pointer2 >= 0) {
            if (pointer1 >= 0 && nums1[pointer1] > nums2[pointer2]) {
                nums1[i--] = nums1[pointer1]; // schimba in primul arai ultima cifra diferita de 0, cu ultimul 0 din coada daca e mai mare cu prima cifra din coada array 2
            } else {
                nums1[i--] = nums2[pointer2--];
            }
        }
    }
}