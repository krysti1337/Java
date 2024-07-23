public class Largest_Prime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime (21));
        System.out.println(getLargestPrime (217));
        System.out.println(getLargestPrime (0));
        System.out.println(getLargestPrime (45));
        System.out.println(getLargestPrime (-1));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        int largestPrime = -1;

        while (number % 2 == 0) {
            largestPrime = 2;
            number /= 2;
        }

        for (int i = 3; i <= number; i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }

        return largestPrime;
    }
}
