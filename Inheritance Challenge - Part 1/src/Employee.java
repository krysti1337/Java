public class Employee extends Worker{
    private long employeeID;
    private String hireDate;

    private static int employeeNum = 1; //pentru a pune employee Id

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeID = Employee.employeeNum++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
