package dev.lpa;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);


        for (int i = 0; i < 7; i++) {
            weekDay = getRandomDay();

            System.out.printf("Name is %s, Ordinal Value = %d%n",
                    weekDay.name(), weekDay.ordinal());

            if (weekDay == DayOfTheWeek.SAT) {
                System.out.println("Found a Saturday!!!");
            }

        }

        for (int i = 0; i < 7; i++) {
            switchDayOfWeek(weekDay);
        }

        for (Topping topping : Topping.values()) { //reprezentarea la switch in Enum

            System.out.println(topping.name() + " : " + topping.getPrice());
        }

    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay) {

        int weekDayInteger = weekDay.ordinal() + 1;

        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case FRI -> System.out.println("Friday is Day" + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() + "day is Day " + weekDayInteger);
        }
    }

    public static DayOfTheWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }
}
