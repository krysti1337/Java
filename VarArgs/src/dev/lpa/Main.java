package dev.lpa;

public class Main {

    public static void main(String... args) {

        System.out.println("Hello World again");

        String[] splitStrings = "Hello World again".split(" "); // .split o sa desparta intregul String dupa fiecare " " gasit in string
        printText(splitStrings);

        //Hello
        //World
        //again
        //asa va arata

        System.out.println("_".repeat(20));
        printText("Hello");
        System.out.println("_".repeat(20));
        printText("Hello","World","again");
        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",",sArray));
    }

    private static void printText(String... textList){

        for(String t : textList){ //ia un array de String si face print fiecare sir pe propria linie utilizand un for enhance
            System.out.println(t);
        }
    }
}
