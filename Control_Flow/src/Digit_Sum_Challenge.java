public class Digit_Sum_Challenge {
    public static void main(String[] args) {
        System.out.println("Sum of the digit number = "+sumDigit(125));
        System.out.println("Sum of the digit number = "+sumDigit(1000));
        System.out.println("Sum of the digit number = "+sumDigit(255));
        System.out.println("Sum of the digit number = "+sumDigit(1234));


    }

    public static  int sumDigit(int number){
        if(number < 0){
            return -1;
        }

        int sum = 0;

        for(int i = 1; i < 6; i++){

            if(number - 1 < 0){
                break;
            }

            sum += number % 10;
            number = number / 10;

        }

        return sum;

    }
}
