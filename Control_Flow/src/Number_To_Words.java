import jdk.jfr.consumer.RecordedEvent;

public class Number_To_Words {
    public static void main(String[] args) {

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println("-------------");

        System.out.println(reverse(-121));
        System.out.println(reverse(-2512));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        System.out.println("-------------");

        numberToWords(-121);
        numberToWords(1212);
        numberToWords(1234);
        numberToWords(100);
        numberToWords(0);


    }

    public static void numberToWords(int number) { //method to print word

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if(number == 0){
            System.out.println("Zero");
            return;
        }

        int reverseNumber = reverse(number);
        int originalDigitcount = getDigitCount(number);
        int reverseDigitCount = getDigitCount(reverseNumber);

        while (reverseNumber > 0){
            int digit = reverseNumber % 10;
            reverseNumber /= 10;

            String word = switch (digit) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "";
            };
            System.out.print(word + " ");
        }

        for(int i = 0; i < originalDigitcount - reverseDigitCount; i++){
            System.out.print("Zero ");
        }

        System.out.println();

    }


    public static int getDigitCount(int number) { //method to get count of the digit
        int count = 0;
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }

        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static int reverse(int number) {

        int reverseNumber = 0;
        boolean isNegative = number < 0;

        if (isNegative) {
            number = -number;
        }

        while (number != 0) {
            reverseNumber = reverseNumber * 10 + number % 10;
            number /= 10;
        }

        if (isNegative) {
            reverseNumber = -reverseNumber;
        }

        return reverseNumber;
    }
}
