//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String helloWrold = "Hello" + "World";
        helloWrold.concat(" and Goodbye"); // nu va fi nimic pentru ca este imutabil nu i-am atribuit variabila, pentru ca .concat creaza un nou string

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye"); //StringBuilder este mutabil si nu are nevoie de o alta variabila pentru a pastra schimbarile pentru ca nu creaza un nou String dar in schimb il modifica pe cel care este".append este la fel ca si .concat"

        printInformation(helloWrold);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(17));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g'); //sterge apoi adauga
        System.out.println(builderPlus);

        builderPlus.replace(16, 17, "G"); // inlocuieste
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string){

        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder){

        System.out.println("String = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}