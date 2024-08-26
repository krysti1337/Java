package dev.lpa;

import java.util.Arrays;

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
//        newArray = new int[] {5, 4, 3, 2, 1}; //putem scrie si asa array

        newArray = new int[5];
        for(int i = 0; i < newArray.length; i++){ //putem valori in array
            newArray[i] = newArray.length - i;
        }
        for(int i = 0; i < newArray.length; i ++){
            System.out.print(newArray[i] +  " ");
        }

        System.out.println();
        //folosim for each
        for (int element : newArray){
            System.out.print(element + " ");
        }

        System.out.println(Arrays.toString(newArray));

        Object objectVariable = newArray;

        if(objectVariable instanceof int[]){ //In acest cod, atribui o referinta de matrice intreaga unei referinte de obiect
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3]; //putem crea o matrice de obiecte care accepta orice tip in Java

        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = Arrays.toString(newArray); //putem atribui un array catre unui alt array, daca scriem pur si simplu objectArray[2] = newArray, la System.out.print vom avea adresa lui newArray, nu si contentul lui

        System.out.println(Arrays.toString(objectArray));

    }
}
