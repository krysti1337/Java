public class Prime_Number_Challenge {
    public static void main(String[] args) {

//        System.out.println("0 is " + (isPrime(0) ? "" : " NOT ") + "a prime number");
//        System.out.println("1 is " + (isPrime(1) ? "" : " NOT ") + "a prime number");
//        System.out.println("2 is " + (isPrime(2) ? "" : " NOT ") + "a prime number");
//        System.out.println("3 is " + (isPrime(3) ? "" : " NOT ") + "a prime number");
//        System.out.println("8 is " + (isPrime(8) ? "" : " NOT ") + "a prime number");
//        System.out.println("17 is " + (isPrime(17) ? "" : " NOT ") + "a prime number");

        int countPrime = 0;
        for(int i = 50; i < 150; i ++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                countPrime++;
                if(countPrime == 10){
                    System.out.println("Found 10 - Exiting for loop");
                    break;
                }
            }
        }
        System.out.println("Number of prime numbers between 2 and 999 is: " + countPrime);
    }

    public static boolean isPrime(int wholeNumber) {

        if(wholeNumber <= 2){
            return  (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++)
            if (wholeNumber % divisor == 0) {
                return false;
            }
        return true;
    }

}
