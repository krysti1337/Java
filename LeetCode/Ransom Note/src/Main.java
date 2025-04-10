/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.



Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true

 */
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String ransomNote = "ransomNote";
        String magazine = "magazine";
        System.out.println(solution.canConstruct(ransomNote, magazine));
    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<String, Integer> ransomMap = new HashMap<>();
        Map<String, Integer> magazineMap = new HashMap<>();

        for (char n : ransomNote.toCharArray()) {
            String key = String.valueOf(n);
            ransomMap.put(key, ransomMap.getOrDefault(key, 0) + 1);
        }

        for (char n : magazine.toCharArray()) {
            String key = String.valueOf(n);
            magazineMap.put(key, magazineMap.getOrDefault(key, 0) + 1);
        }

        for(String key : ransomMap.keySet()){

            int ransomCount = ransomMap.get(key);
            int magazineCount = magazineMap.getOrDefault(key, 0);

            if(magazineCount < ransomCount) {
                return false;
            }
        }

        return true;
    }
}