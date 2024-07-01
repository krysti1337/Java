public class Number_Of_Days_In_Month {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020)); // should return 31
        System.out.println(getDaysInMonth(2, 2020)); // should return 29
        System.out.println(getDaysInMonth(2, 2018)); // should return 28
        System.out.println(getDaysInMonth(-1, 2020)); // should return -1
        System.out.println(getDaysInMonth(1, -2020)); // should return -1
    }
    public static boolean isLeapYear(int year) {
        if (year <= 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {  // March
            // May
            // July
            // August
            // October
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31; // December
            }  // April
            // June
            // September
            case 4, 6, 9, 11 -> {
                return 30; // November
            }
            case 2 -> {
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }  // February
            }
            default -> {
                return -1;
            }
        }
    }
}
