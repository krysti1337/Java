import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    // Metoda pentru a obține un array de la utilizator
    public static int[] getIntegers(int len) {
        int[] tempArray = new int[len];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < len; i++) {
            System.out.println("Enter element [" + i + "] :");
            tempArray[i] = s.nextInt();
        }
        return tempArray;
    }

    // Metoda pentru a sorta array-ul în ordine descrescătoare
    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        for (int i = 0; i < sortedArray.length / 2; i++) {
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
            sortedArray[sortedArray.length - 1 - i] = temp;
        }
        return sortedArray;
    }

    // Metoda pentru a printa array-ul
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
