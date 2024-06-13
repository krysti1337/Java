public class Float_values {
    public static void main(String[] args) {
        System.out.println("Float value range (" + Float.MIN_VALUE + ", " + Float.MAX_VALUE + ")");

        int intValue = 5;
        float floatValue = 5;
        double doubleValue = 5;

        System.out.printf("int: %d, float: %.2f, double: %.2f%n", intValue, floatValue, doubleValue);

        float secfloatValue = (float) 5.25;

        System.out.printf("second float: " + secfloatValue);

        System.out.println();
        intValue = 5 / 2;
        System.out.println("intValue: " + intValue);

        floatValue = 5f / 3f;
        System.out.println("floatValue: " + floatValue);

        doubleValue = 5d / 3d;
        System.out.println("doubleValue: " + doubleValue);

        intValue = (int) (5 / 2.0);
        System.out.println("intValue: " + intValue);
        
    }
    
}
