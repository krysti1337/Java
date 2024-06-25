import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Seconds_And_Minutes_Challenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid data for sedonds (" + seconds + "), must be a positive integer value";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for minutes (" + minutes + "), must be a positive integer value";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59";
        }

        int hours1 = minutes / 60;

        //A doua modalitate de a primi orele din secunde
        //int hours2 = seconds / 3600;
        int remainingMinutes = minutes % 60;

        return hours1 + "h " + remainingMinutes + "m " + seconds + "s ";
    }
}
