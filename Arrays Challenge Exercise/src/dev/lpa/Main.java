package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = getRandomArray(10);

        Arrays.sort(array);
        reverse(array);

        System.out.println(Arrays.toString(array));
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();

        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(50);
        }

        return newInt;
    }

    public static void reverse(int[] array){
        int n = array.length;

        for(int i  = 0; i < n / 2; i ++){

            // Stocarea temporară a elementelor din prima jumătate
            int tem = array[i];

            // Atribuirea primei reprize
            // Până la ultima jumătate
            array[i] = array[n - i - 1];

            // Atribuirea ultimei reprize
            // La prima jumătate
            array[n - i - 1] = tem;
        }
    }
}
