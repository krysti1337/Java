public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen() {
        if (this.age > 12 && this.age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        }
        if (this.firstName.isEmpty()) {
            return this.lastName;
        }
        if (this.lastName.isEmpty()) {
            return this.firstName;
        }
        return this.firstName + " " + this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
}
