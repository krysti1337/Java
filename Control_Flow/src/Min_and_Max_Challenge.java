import java.util.InputMismatchException;
import java.util.Scanner;

public class Min_and_Max_Challenge {
    public static void main(String[] args) {
        getInput();
    }

    public static void getInput() {
        Scanner scanner = new Scanner(System.in);

        double maxNumber = 0.00d;
        double minNumber = 0.00d;
        double number;
        boolean valid = false;
        int i = 0;

        do {
            try {
                System.out.print("Enter number " + i + " = ");
                String nextNumber = scanner.nextLine();
                number = Double.parseDouble(nextNumber);
                i++;
                if (minNumber > number) {
                    minNumber = number;
                }
                if (maxNumber < number) {
                    maxNumber = number;
                }
            } catch (InputMismatchException BadUserData) {
                System.out.println(" ");
                scanner.nextLine(); //clear the scanner buffer
                valid = true;
            } catch (NumberFormatException nfe) {
                System.out.println(" ");
                valid = true;
            }


        } while (!valid);
        if (i > 0) {
            System.out.println("The max number = " + maxNumber + " The minimum number = " + minNumber);

        } else {
            System.out.println("No valid data entered ");
        }
    }
}
