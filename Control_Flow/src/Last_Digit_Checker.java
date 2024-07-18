public class Last_Digit_Checker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));

    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int threeNumber){

        if(isValid(firstNumber) && isValid(secondNumber) && isValid(threeNumber)) {

            int lastDigit1 = firstNumber % 10;
            int lastDigit2 = secondNumber % 10;
            int lastDigit3 = threeNumber % 10;

            if (lastDigit1 == lastDigit2 || lastDigit2 == lastDigit3 || lastDigit1 == lastDigit3) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int number){
        if(number < 10 || number > 1000){
            return false;
        }
        return true;
    }
}
