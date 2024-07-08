public class Sum_3_and_5_Challenge {
    public static void main(String[] args) {

        int sumNumber = 0;
        int countNumber = 0;
        for (int i = 1; i < 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Found a match - " + i);
                sumNumber = i + sumNumber;
                countNumber++;

                if (countNumber == 5) {
                    break;
                }

            }
        }
        System.out.println("Sum = " + sumNumber);
    }
}
