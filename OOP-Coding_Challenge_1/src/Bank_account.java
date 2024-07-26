public class Bank_account {

    public Bank_account() {
        this(1231, 2.50, "Default name",
                "Default address", "Default number");
        System.out.println("Empty constructor called");
    }

    public Bank_account(int number, double balance, String name, String email, String phone) {

        System.out.println("Account constructor with parameters called");

        this.accountNumber = number;
        this.customerBalance = balance;
        this.customerName = name;
        this.customerEmail = email;
        this.customerPhone = phone;

    }

    public Bank_account(String customerName, String customerEmail, String customerPhone) {
        this(9999, 100.55, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    private int accountNumber;
    private double customerBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void depositFunds(double depositAmount) {

        customerBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + this.customerBalance);

    }

    public void withdrawFunds(double withdrawalAmount) {
        if (this.customerBalance - withdrawalAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + this.customerBalance + " in your account.");
        } else {
            this.customerBalance -= withdrawalAmount;
            System.out.println("Withdrawal of $ " + withdrawalAmount + " processed, Remaining balance = $" + this.customerBalance);
        }

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

}
