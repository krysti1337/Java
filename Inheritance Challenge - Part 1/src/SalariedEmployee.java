public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate,
                            double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }


    @Override
    public double collectPay(){
        double paycheck = annualSalary / 26; //nu vreau ca salariu sa fie aratat la iveala, dar vreau sa pot sa ii platesc salariu
                                        //asa ca nu voi face prin tooString, dar iau si fac o functie de collectPay, care imi va arata cat trebuie sa il platesc o data la 2 saptamani
        double adjustPay = (isRetired) ? 0.9 * paycheck : paycheck;

        return (int) adjustPay;
    }

    public void retire(){

        terminate("12/12/2025");
        isRetired = true;
    }
}
