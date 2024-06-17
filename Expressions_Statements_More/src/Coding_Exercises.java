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

        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

        System.out.println(" ");
        System.out.println("------Next Exercises------");

        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));


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

}
