import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int n = 19;

        Solution solution = new Solution();

        System.out.println(solution.isHappy(n));
    }
}

class Solution {
    public boolean isHappy(int n) {

        Set<Integer> set_num = new HashSet<>();

        while (n != 1 && !set_num.contains(n)){
            set_num.add(n);
            int sum = 0;
            while (n > 0){
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }

        return n == 1;
    }
}