public class Switch_Expression_Challenge {
    public static void main(String[] args) {

        printDayOfWeak(0);
        printDayOfWeak(1);
        printDayOfWeak(2);
        printDayOfWeak(3);
        printDayOfWeak(4);
        printDayOfWeak(5);
        printDayOfWeak(6);
        printDayOfWeak(7);

        System.out.println(" ");
        System.out.println("Second method");
        System.out.println(" ");

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);



    }


    public static void printDayOfWeak(int day){
        String dayofWeak = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(day + " stands for " + dayofWeak);
    }

    //Bonus with if-then
    public static void printWeekDay(int day){

        String dayofWeak = "Invalid day";

        if(day == 0){
            dayofWeak = "Sunday";
        } else if (day == 1) {
            dayofWeak = "Monday";
        }else if (day == 2) {
            dayofWeak = "Tuesday";
        }else if (day == 3) {
            dayofWeak = "Wednesday";
        }else if (day == 4) {
            dayofWeak = "Thursday";
        }else if (day == 5) {
            dayofWeak = "Friday";
        }else if (day == 6) {
            dayofWeak = "Saturday";
        }

        System.out.println(day + " stand for " + dayofWeak);
    }
}
