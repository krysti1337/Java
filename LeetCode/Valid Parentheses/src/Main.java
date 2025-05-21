import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String s = "()[]{}";
        solution.isValid(s);
    }
}

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        stack.push('[');
        stack.push(']');
        stack.push('(');
        stack.push(')');
        stack.push('{');
        stack.push('}');

        for(Character c : s.toCharArray()){
            System.out.println(c);
        }

        return true;
    }
}