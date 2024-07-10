public class WhileLoop_challenge {
    public static void main(String[] args) {
        int start = 4;
        int finish = 20;
        while (start <= finish) {
            System.out.println(isEvenNumber(start));
            start++;
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}

