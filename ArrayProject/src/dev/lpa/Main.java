package dev.lpa;

public class Main {
    public static void main(String[] args) {

        int[] myIntArray = new int[10]; //initializeaza un array cu 10 entitati pentru stocare
        myIntArray[0] = 45;
        myIntArray[1] = Integer.parseInt("1");
        myIntArray[5] = 50; //put 50 on position 6

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //asa declaratie a unui array se numeste array anonymous
        System.out.println("First = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Length of array = " + arrayLength);
        System.out.println("Last = " + firstTen[arrayLength - 1]);

        int[] newArray;
        newArray = new int[] {5, 4, 3, 2, 1}; //putem scrie si asa array

        for(int i = 0; i < newArray.length; i ++){
            System.out.print(newArray[i] +  " ");
        }
    }
}
