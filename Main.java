
public class Main {
    public static void main(String[] args) {
    short MyMinShortValue = Short.MIN_VALUE;
    int MyMinIntValue = Integer.MIN_VALUE;
    System.out.println("Minimum short value: " + MyMinShortValue);
    System.out.println("Minimum int value: " + MyMinIntValue);
    
    byte MyMinByteValue = Byte.MIN_VALUE;
    System.out.println("New byte value: " + MyMinByteValue);
    byte MyNewByteValue = (byte) (MyMinByteValue / 2);

    System.out.println("New short value: " + MyNewByteValue);

    }
}