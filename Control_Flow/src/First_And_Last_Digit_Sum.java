public class First_And_Last_Digit_Sum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(-5));

    }

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = number % 10;;
        int lastDigit = 0;

        for(int i = 1; i < 10; i++){
            if(number / 10 == 0){
                lastDigit = number % 10;
                break;
            }else {
                number = number / 10;
            }
        }
        return firstDigit + lastDigit;
    }
}
