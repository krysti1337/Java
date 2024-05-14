public class Primitive_Types_Challenge {
    public static void main(String[] args) {

        byte FirstByteVariable = 50;

        short FirstShortVariable = 10000;

        int FirstIntVariable = 20000;

        long sum = (100000 + (int) (FirstIntVariable) + (short) (FirstShortVariable) + (byte) (FirstByteVariable));

        //asa este gresit si nu se face in felul dat
        long FirstLongVariable = (long) sum;
        System.out.println("FirstLongVariable = "+ FirstLongVariable);

        //metoda corecta
        long sum2 = 100000L + 10L * (FirstByteVariable + FirstShortVariable + FirstIntVariable);

        long SecondLongVariable = sum2;

        System.out.println("The correct variant for this challenge "+ SecondLongVariable);
    }
}
