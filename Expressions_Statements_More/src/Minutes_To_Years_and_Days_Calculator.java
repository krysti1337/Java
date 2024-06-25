public class Minutes_To_Years_and_Days_Calculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int days = (int) minutes / 1440;
            int years = days / 365;

            if (days - 365 != 0) {

                int remainingDays = days - 365 * years;
                System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
            } else {
                System.out.println(minutes + " min = " + years + " y and " + (days - days) + " d");
            }
        }
    }
}
