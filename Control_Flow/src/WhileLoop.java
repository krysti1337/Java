public class WhileLoop {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("While ");
        int j = 1;
        boolean isReady = false;
        while (true) {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        }

        System.out.println("Do While ");
        int k = 0;
        do {
            if (k > 5) {
                break;
            }
            System.out.println(j);
            k++;
        } while (isReady);

        int number = 0;
        while (number < 50){
            number += 5;
            if(number % 25 == 5){
                continue;
            }
            System.out.print(number + "_");
        }
    }
}
