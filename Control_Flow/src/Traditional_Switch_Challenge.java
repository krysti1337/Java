public class Traditional_Switch_Challenge {
    public static void main(String[] args) {

        char latter = 'C';

        //NATO WORD
        switch (latter){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Latter" + latter + "was not found in the switch");
                break;
        }
    }
}
