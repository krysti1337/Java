package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; //myIntArray ca si anotherArray sunt doar referinte catre array creat mai sus "new int[5]"

        System.out.println("myIntArray =" + Arrays.toString(myIntArray));

        System.out.println("myIntArray =" + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        modifyArray(myIntArray);
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

//        myIntArray =[0, 0, 0, 0, 0]
//        myIntArray =[0, 0, 0, 0, 0]
//        after change myIntArray = [1, 0, 0, 0, 0]
//        after change anotherArray = [1, 0, 0, 0, 0]
//        arata asa pentru ca cand schimbar ceva folosind o referinta catre array, la chemarea celeilalte referinte va fi acelasi rezultat


    }

    private static void modifyArray(int[] array){
        array[1] = 2;
    }
}
