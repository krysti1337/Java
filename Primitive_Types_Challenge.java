public class Primitive_Types_Challenge {
    public static void main(String[] args) {

        byte FirstByteVariable = 50;

        short FirstShortVariable = 10000;

        int FirstIntVariable = 20000;

        long sum = (100000 + (int) (FirstIntVariable) + (short) (FirstShortVariable) + (byte) (FirstByteVariable));

        long FirstLongVariable = (long) sum;
        System.out.println("FirstLongVariable = "+ FirstLongVariable);
    }
}
