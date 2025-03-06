//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.
Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

 */
public class Main {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = "Never a foot too far, even.";
        Solution solution = new Solution();

       // System.out.println(solution.isPalindrome(s));
       // System.out.println(solution.isPalindrome(s2));
        System.out.println(solution.isPalindrome(s3));
    }
}

class Solution {
    public boolean isPalindrome(String s) {

        String word = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if(word.isEmpty()){
            return true;
        }
        if(word.length() == 2){
            return word.charAt(0) == word.charAt(1);
        }

        int p1 = 0, p2 = word.length() - 1;
        int count = 0;
        while (p1 < p2){
            if(word.charAt(p1) == word.charAt(p2)){
                count ++;
            }
            p1++;
            p2--;
        }

        if(word.length() % 2 != 0){
            return count == (word.length() - 1) / 2;
        }else{
            return count == word.length() / 2;
        }
    }
}

