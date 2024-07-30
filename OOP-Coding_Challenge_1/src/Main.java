//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        bankAccount();
        System.out.println("----------------");

        simpleCalculator();
        person();
        customer();


    }

    public static void bankAccount() {

//        Bank_account bobsAccount = new Bank_account(1234, 1000.0, "Bob Brown" ,
//                "bobemail@gmail.com", "(087) 123-123-123");

        Bank_account bobsAccount = new Bank_account();

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getCustomerBalance());

        Bank_account timsAccount = new Bank_account("Tim", "timemail@gmial.com", "1234454");
        System.out.println("AccountNo: " + timsAccount.getAccountNumber() +  "; name " + timsAccount.getCustomerName());
//        bobsAccount.setAccountNumber(1234);
//        bobsAccount.setCustomerBalance(10000.0);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmail("bobemail@bob.com");
//        bobsAccount.setCustomerPhone("0987654321");


//        bobsAccount.withdrawFunds(100.0);
//        bobsAccount.depositFunds(250);
//        bobsAccount.withdrawFunds(50);
//
//        bobsAccount.withdrawFunds(200);
//        bobsAccount.depositFunds(100);
//        bobsAccount.withdrawFunds(45.55);
//        bobsAccount.withdrawFunds(54.46); //check
//
//        bobsAccount.withdrawFunds(54.45);
    }

    public static void simpleCalculator() {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }

    public static void person() {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
        person.setAge(-5);
        System.out.println("Age: " + person.getAge());
    }

    public static void customer(){

        Customer customer = new Customer("Cris", 1000, "crisemail@gmail.com");

        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimid());
        System.out.println(customer.getEmailAddress());

        Customer secondCustomer = new Customer();

        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimid());
        System.out.println(secondCustomer.getEmailAddress());

    }
}