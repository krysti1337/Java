import java.util.Scanner;

public class Input_Calculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int avg = 0;
        int number;
        boolean valid = false;
        int i = 0;

        do {
            try {
                String nextNumber = scanner.nextLine();
                number = Integer.parseInt(nextNumber);
                sum += number;
                i++;
            } catch (NumberFormatException nfe) {
                System.out.println(" ");
                valid = true;
            }
        } while (!valid);


        if (i > 0) {
            double average = (double) sum / i;
            long roundedAverage = Math.round(average);
            System.out.println("SUM = " + sum + " AVG = " + roundedAverage);

        } else {
            System.out.println("SUM = " + sum + " AVG = " + avg);
        }
    }
}
