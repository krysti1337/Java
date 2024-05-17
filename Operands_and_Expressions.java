public class Operands_and_Expressions {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("result 1 + 2 = " + result);

        result  = result - 1;
        System.out.println("result - 1 = " + result);

        char firstChar = 'A';
        char secondChar = 'B';

        //decimal value for A and B are 65 and 66
        System.out.println(firstChar + secondChar);
        
        //put in the string that
        System.out.println(" " + firstChar + secondChar);

        result = result * 10;
        System.out.println("result * : " + result );
        
        result = result / 4;
        System.out.println("result / : " + result );

        //The Remainder Operator %
        result = result % 3;
        System.out.println("result % : " + result );

    }
}
