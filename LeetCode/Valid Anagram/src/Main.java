import java.util.HashMap;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
 */
public class Main {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        Solution solution = new Solution();

        System.out.println(solution.isAnagram(s, t));

    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> s_hashMap = new HashMap<>();
        HashMap<Character, Integer> t_hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            s_hashMap.put(s.charAt(i), s_hashMap.getOrDefault(s.charAt(i), 0) + 1);
            t_hashMap.put(t.charAt(i), t_hashMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        System.out.println(s_hashMap);
        System.out.println(t_hashMap);
        if(s_hashMap.equals(t_hashMap)) {
            return true;
        }
        return false;
    }
}

