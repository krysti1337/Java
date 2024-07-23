import java.util.InputMismatchException;
import java.util.Scanner;

public class Reading_User_Input_Challenge {

    public static void main(String[] args) {
        getInput();
    }

    public static void getInput() {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        double sum = 0;
        do {
            try {
                System.out.print("Enter number " + i + " = ");
                String nextNumber = scanner.nextLine();
                double number = Double.parseDouble(nextNumber);
                sum += number;
                i++;
            } catch (InputMismatchException BadUserData) {
                System.out.println("Invalid number ! Try again");
                scanner.nextLine(); //clear the scanner buffer
            } catch (NumberFormatException nfe){
                System.out.println("Invalid number ! Try again");
            }

        } while (i < 6);

        System.out.println("The sum of the 5 numbers  = " + sum);
    }
}
