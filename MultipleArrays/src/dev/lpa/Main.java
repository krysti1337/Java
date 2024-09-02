package dev.lpa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array2 = new int[4][4];

        System.out.println(Arrays.toString(array2)); //[[I@65ab7765, [I@1b28cdfa, [I@eed1f14, [I@7229724f] - pentru ca sunt array in array
        System.out.println("array2.length =" + array2.length); //array2.length =4

        for (int[] outer : array2) {
//            System.out.println(outer);
//                [I@65ab7765
//                [I@1b28cdfa
//                [I@eed1f14
//                [I@7229724f

            System.out.println(Arrays.toString(outer));
//            [0, 0, 0, 0]
//            [0, 0, 0, 0]
//            [0, 0, 0, 0]
//            [0, 0, 0, 0]
        }

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) { //while i = 0, j will loop form 0 to 3
//                System.out.print(array2[i][j] + " ");
                array2[i][j] = (i * 10) + (j + 1); //[[1, 2, 3, 4], [11, 12, 13, 14], [21, 22, 23, 24], [31, 32, 33, 34]]
            }
//            System.out.println();
        }
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        for (var outer : array2) {
            for (var element : outer) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        System.out.println(Arrays.deepToString(array2)); //[[1, 2, 3, 4], [11, 12, 13, 14], [21, 22, 23, 24], [31, 32, 33, 34]]

        array2[1] = new int[]{10, 20, 30};
        System.out.println(Arrays.deepToString(array2)); //[[1, 2, 3, 4], [10, 20, 30], [21, 22, 23, 24], [31, 32, 33, 34]]

        Object[] anyArray = new Object[3]; //nested arrays
        System.out.println(Arrays.toString(anyArray));
        anyArray[0] = new String[]{"a", "b", "C"};
        System.out.println(Arrays.deepToString(anyArray)); //[[a, b, C], null, null]

        anyArray[1] = new String[][]{
                {"1", "2", "3"},
                {"a", "b", "c", "d"},
                {"1", "b", "3", "d", "4", "G"}
        };
        System.out.println(Arrays.deepToString(anyArray)); //[[a, b, C], [[1, 2, 3], [a, b, c, d], [1, b, 3, d, 4, G]], null]

        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray)); //[[a, b, C], [[1, 2, 3], [a, b, c, d], [1, b, 3, d, 4, G]], [[[0, 0], [0, 0]], [[0, 0], [0, 0]]]]

        for(Object element : anyArray){
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString = " + element);
            System.out.println(Arrays.deepToString((Object[])element));
//            Element type = String[]
//            Element toString = [Ljava.lang.String;@58372a00
//                    [a, b, C]
//            Element type = String[][]
//            Element toString = [[Ljava.lang.String;@4dd8dc3
//                    [[1, 2, 3], [a, b, c, d], [1, b, 3, d, 4, G]]
//            Element type = int[][][]
//            Element toString = [[[I@5fd0d5ae
//                    [[[0, 0], [0, 0]], [[0, 0], [0, 0]]]

        }
    }
}
