import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static int readInteger(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number for lenght");
        int n = s.nextInt();
        return n;
    }

    public static int[] readElements(int n){
        Scanner s = new Scanner(System.in);

        int arrayList[] = new int[n];

        for(int i = 0; i < arrayList.length; i++){
            System.out.println("Enter the number [" + i + "]");
            arrayList[i] = s.nextInt();
            i++;
        }
        Arrays.sort(arrayList);
        return arrayList;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }

        return min;
    }

    private static void reverse(int[] array){

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for(int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;

        }
    }

    private static int[] reverseCopy(int[] array){

        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for(int el : array){
            reversedArray[maxIndex--] = el;
        }

        return reversedArray;
    }

}
