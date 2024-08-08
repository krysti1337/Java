//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List: \n " +
                "\t\u2022 First Point \n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List : 
                        \u2022 First Point
                            \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 22;
        System.out.printf("Your age is %d %n", age);

        int yearOfBirth = 2024 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);
        System.out.printf("Your age is %.2f %n", (float)age);

        for (int i = 1;  i<= 100000; i *= 10){
            System.out.printf("Printing %6d%n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

        printInformation("Hello World");
        printInformation("");
        printInformation("\t   \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r')); //cautam r in Hello World
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of r = %d %n", helloWorld.indexOf('l')); //primul l din Hello Wrold
        System.out.printf("index of r = %d %n", helloWorld.lastIndexOf('l')); //ultimul 'l' din Hello World

        System.out.printf("index of r = %d %n", helloWorld.indexOf('l',3)); //cifra dupa virgula arata de unde trebuie sa caute in String index-ul
        System.out.printf("index of r = %d %n", helloWorld.lastIndexOf('l',8));

        String helloWorldLower = helloWorld.toLowerCase();

        if(helloWorld.equals(helloWorldLower)){
            System.out.println("Value match exactly");
        }
        if(helloWorld.equalsIgnoreCase(helloWorldLower)){
            System.out.println("Value match ignoring case");
        }

        if(helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }

        if(helloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }

        if(helloWorld.contains("World")){
            System.out.println("String contains with World");
        }

        if(helloWorld.contentEquals("Hello World")){
            System.out.println("Value match exactly");
        }

    }

    public static void  printInformation(String string){

        int length = string.length();

        System.out.printf("Length = %d %n ",length);

        if(string.isEmpty()){ //String nu are nimic in el
            System.out.println("String is empty");
            return;
        }

        if(string.isBlank()){ //String este gol dar are caracter ca de exemplu space
            System.out.println("String is blank");
        }
        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length-1));

    }
}
