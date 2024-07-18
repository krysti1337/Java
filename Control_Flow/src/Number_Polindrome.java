public class Number_Polindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int lastDigit = 0;
        int reversNumber = 0;
        int number1 = number;
        for (int i = 1; i < 10; i++) {
            lastDigit = number % 10;
            reversNumber += lastDigit;
            number = number / 10;


            if (number == 0) {
                break;
            } else {
                reversNumber = reversNumber * 10;
            }

        }

        if(reversNumber == number1){
            return true;
        } else{
            return false;
        }
    }
}
