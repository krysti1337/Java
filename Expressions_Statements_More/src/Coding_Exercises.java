public class Coding_Exercises {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("------Next Exercises------");
        //Positive, Negative or Zero
        CheckNumber(10);
        CheckNumber(-9);
        CheckNumber(0);

        System.out.println(" ");
        System.out.println("------Next Exercises------");

        //speed converter
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(75.114));

        printConversion(10.25);
        printConversion(1.5);
        printConversion(-5.6);
        printConversion(75.114);

        System.out.println(" ");
        System.out.println("------Next Exercises------");

        //megabyte converter
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

        System.out.println(" ");
        System.out.println("------Next Exercises------");

        //barking dog challenge
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        System.out.println(" ");
        System.out.println("------Next Exercises------");

        //leap year calculator
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1924));

        System.out.println(" ");
        System.out.println("------Next Exercises------");

        //Decimal Comparator
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println(areEqualByThreeDecimalPlaces(4.0, 5.0));

        System.out.println(" ");
        System.out.println("------Next Exercises------");

        //Equal Sum Checker

        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));

        System.out.println(" ");
        System.out.println("------Next Exercises------");

        //Teen Number Checker
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));



    }

    //Positive, Negative or Zero
    public static void CheckNumber(int number) {
        if (number > 0) {
            System.out.println("positive");

        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static int toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        double number = kilometersPerHour / 1.609;
        long rounded = Math.round(number);
        return (int) rounded;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        double number = kilometersPerHour / 1.609;
        long rounded = Math.round(number);
        System.out.println(kilometersPerHour + " km/h =" + rounded + " mi/h");
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mb = kiloBytes / 1024;
            int remaining = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + mb + " MB and " + remaining + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            return (hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 24);
        }
        return false;
    }

    public static boolean isLeapYear(int year) {
        if (year <= 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        int first = (int) (firstNumber * 1000);
        int second = (int) (secondNumber * 1000);

        return first == second;

    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {

        return ((num1 + num2) == num3);
    }

    public static boolean hasTeen(int num1, int num2, int num3) {

        if (num1 >= 13 && num1 <= 19) {
            return true;
        } else if (num2 >= 13 && num2 <= 19) {
            return true;
        } else if (num3 >= 13 && num3 <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int num1){
        if (num1 >= 13 && num1 <= 19) {
            return true;
        }
        return false;
    }


}
