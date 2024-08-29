import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    private int[] firstArray = ;

    public int[] getIntegers(int len){

        int[] tempArray = new int[len];
        Scanner s = new Scanner(System.in);
        boolean flag = true;
            for(int i = 0; i < len; i++){
                System.out.println("Enter element [" + tempArray[i] +"] :");
                tempArray[i] = s.nextInt();

            }
        System.out.println("Array is :");
        return tempArray;
    }

    @Override
    public String toString() {
        return "SortedArray{" +
                "firstArray=" + Arrays.toString(firstArray) +
                '}';
    }
}
