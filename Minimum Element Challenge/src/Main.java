import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String... args) {
        int[] array = readIntegers();
        System.out.println(Arrays.toString(array));
        findMin(array);

    }

    public static int[] readIntegers(int... number) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the range of array :");
        int[] num = new int[s.nextInt()];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter number [" + i + "]");
            int n = s.nextInt();
            num[i] = n;
        }
        return num;
    }

    public static void findMin(int[] array) {
        int[] tempArray = Arrays.copyOf(array, array.length);
        int min = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] < tempArray[i + 1]) {
                min = tempArray[i];
            } else {
                min = tempArray[i + 1];
            }
            i++;
        }
       System.out.println("Min = " + min);
    }
}