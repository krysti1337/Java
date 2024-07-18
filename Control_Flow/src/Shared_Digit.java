public class Shared_Digit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 43));
        System.out.println(hasSharedDigit(25, 51));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if ((firstNumber < 10) || (firstNumber > 99) || (secondNumber < 10) || (secondNumber > 99)) {
            return false;
        }


        int firstDigit1 = firstNumber / 10;
        int firstDigit2 = firstNumber % 10;


        int secondDigit1 = secondNumber / 10;
        int secondDigit2 = secondNumber % 10;


        if (firstDigit1 == secondDigit1 || firstDigit1 == secondDigit2 || firstDigit2 == secondDigit1 || firstDigit2 == secondDigit2) {
            return true;
        }

        return false;
    }
}
