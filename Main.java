
public class Main {
    public static void main(String[] args) {

    short MyMinShortValue = Short.MIN_VALUE;
    int MyMinIntValue = Integer.MIN_VALUE;
    byte MyMinByteValue = Byte.MIN_VALUE;

    System.out.println("Minimum short value: " + MyMinShortValue);
    System.out.println("Minimum int value: " + MyMinIntValue);
    System.out.println("Minimum byte value: " + MyMinByteValue);

    int MyNewIntValue =  MyMinIntValue / 2;
    System.out.println("New int value: " + MyNewIntValue);

    short MyNewShortValue = (short) (MyMinShortValue / 2);
    System.out.println("New short value: " + MyNewShortValue);
    
    byte MyNewByteValue = (byte) (MyMinByteValue / 2);
    System.out.println("New short value: " + MyNewByteValue);

    }
}