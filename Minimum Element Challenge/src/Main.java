import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String... args) {
        int[] array = readIntegers();
        System.out.println(Arrays.toString(array));
        findMin(array);
        reverse(array);

    }

    private static int[] readIntegers(int... number) {
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

    private static void findMin(int[] array) {
        int[] tempArray = Arrays.copyOf(array, array.length);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tempArray.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
            i++;
        }
       System.out.println("Min = " + min);
    }

    private static void reverse(int[] array){
        int[] reverse = Arrays.copyOf(array, array.length);

        for(int i  = 0; i < reverse.length / 2; i ++){
            int tem = reverse[i];
            reverse[i] = reverse[reverse.length - i - 1];
            reverse[reverse.length - i - 1] = tem;
        }

        System.out.println(Arrays.toString(reverse));
    }


}