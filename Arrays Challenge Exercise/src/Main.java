import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        System.out.println(Arrays.toString(sortIntegers(unsortedArray)));
    }

    public static int[] getRandomArray(int len) {

        Random random = new Random();

        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(50);
        }

        return newInt;
    }

    private static int[] sortIntegers(int[] array){

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length -1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }
}