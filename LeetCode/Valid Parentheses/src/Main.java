import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String s = "()[]{}";
        String s2 = "]";
        String s3 = "({})";
        System.out.println(solution.isValid(s));
        System.out.println(solution.isValid(s2));
        System.out.println(solution.isValid(s3));
    }
}

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();


        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if (c == ')' && open != '(') return false;
                if (c == '}' && open != '{') return false;
                if (c == ']' && open != '[') return false;
            }
        }

        return stack.isEmpty();
    }
}