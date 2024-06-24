public class Method_Overloading_Challenge {
    public static void main(String[] args) {

        System.out.println("5ft, 8in = "+convertToCentimeters(5,8)+" cm");

    }

    public static double convertToCentimeters(int inches){
        return (double) inches * 2.54d;
    }

    public static double convertToCentimeters(int feet, int inches){

        return (convertToCentimeters((feet * 12) + inches));

    }
}
