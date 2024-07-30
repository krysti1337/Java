//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Chris";
                        default -> "Anonymous";
                    },
                    switch (i){
                        case 1 -> "22/01/2000";
                        case 2 -> "02/03/2000";
                        case 3 -> "30/06/2002";
                        case 4 -> "20/09/2001";
                        case 5 -> "30/06/2003";
                        default -> "01/01/2000";
                    },
                    "Java Masterclass");
            System.out.println(s);
        }
    }
}