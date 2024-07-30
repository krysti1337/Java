public class Customer {
    String name;
    double creditLimid;
    String emailAddress;

    public Customer(String name, double creditLimid, String emailAddress) {
        this.name = name;
        this.creditLimid = creditLimid;
        this.emailAddress = emailAddress;
    }

    public Customer(){
        this("Cristi", "cristiEmail@gmail.com");
    }

    public Customer(String name, String emailAddress) {
        this(name, 10000, emailAddress);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimid() {
        return creditLimid;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
