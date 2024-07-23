public class Input_using {
    public static void main(String[] args) {
        int currentYear = 2022;
        String userDateOfBirth = "1999";

        int dateOfBirth = Integer.parseInt(userDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));

        String usersAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("The user says he's " + ageWithPartialYear);

        int currentYear1 = 2024;
        System.out.println(getInputFromConsole(currentYear1));
        System.out.println((getInputFormScanner(currentYear1)));
    }

    public static String getInputFromConsole(int currentYear1){

        String name = System.console().readLine("Hi, What's your Name ");
        System.out.println("Hi " + name + ", Thanks for taking being here!");

        String dateOfBirth = System.console().readLine("What year were you born ?");
                int age = currentYear1 - Integer.parseInt(dateOfBirth);

        return  "So you are " + age + " years old";
    }

    public  static String getInputFormScanner(int currentYear1){



        return "";
    }
}
