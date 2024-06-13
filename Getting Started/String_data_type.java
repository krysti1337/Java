public class String_data_type {
    public static void main(String[] args) {
        String MyString = "Acesta este string";

        System.out.println("My string is - " + MyString);

        String MyStringUnitCode = "I wish I had \u00241,000,000.00";

        System.out.println("My string unit code is - " + MyStringUnitCode);

        String numberString = "250.55";
        numberString = numberString  + "49.45";

        System.out.println("Number String is : " + numberString);
        
        String lastString = "10";
        int MyInt = 50;
        
        lastString = lastString + MyInt;

        System.out.println("Last String is : " + lastString);
        
    }
    
}
