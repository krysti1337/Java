public class Primitive_Types_Challenge {
    public static void main(String[] args) {

        byte FirstByteVariable = 10;

        short FirstShortVariable = 20;

        int FirstIntVariable = 100;

        long sum = (10000 + (int) (FirstIntVariable) + (short) (FirstShortVariable) + (byte) (FirstByteVariable));

        //asa este gresit si nu se face in felul dat
        long FirstLongVariable = (long) sum;
        System.out.println("FirstLongVariable = "+ FirstLongVariable);

        //metoda corecta
        long sum2 = 10000L + 10L * (FirstByteVariable + FirstShortVariable + FirstIntVariable);

        long SecondLongVariable = sum2;

        System.out.println("The correct variant for this challenge "+ SecondLongVariable);

        short shortTotal = (short) (1000 + 10 * (FirstByteVariable + FirstShortVariable + FirstIntVariable));

        //folosind casting pentru a primi shortTotal
        System.out.println("shortTotal = "+ shortTotal);
    }
}
