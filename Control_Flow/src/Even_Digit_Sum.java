public class Even_Digit_Sum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;

        for(int i = 1; i < 10; i ++){ //can be done with while
            if(number % 2 == 0) {
                sum += number % 10;
            }
            number = number / 10;
            if(number == 0){
                break;
            }
        }

        return sum;
    }

}

