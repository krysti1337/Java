package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ListIterator<CityAndDistance> iterator = null;

    public static void main(String[] args) {
        LinkedList<CityAndDistance> city = new LinkedList<>(); //creaza linkedList

        //boolean variable
        boolean flag = true;

        //add list and check for dublicate
        addCity(city);
        checkForDublicate(city);
        iterator = city.listIterator(1);

        //Scanner
        Scanner s = new Scanner(System.in);
        printMenu();

        while (flag) {
            System.out.println("Introduceți o comandă:");
            String input = s.nextLine().toUpperCase();

            switch (input) {
                case "F" -> {
                    goForward(city);
                }
                case "B" -> {
                    goBack(city);
                }
                case "L" -> {
                    listPlaces(city);
                }
                case "Q" -> {
                    flag = false;
                }
                default -> {
                    System.out.println("Instructiune falsa");
                break;
                }

            }
        }
    }

    //print menu
    public static void printMenu() {
        System.out.println("""
                Available actions (select word or letter) : 
                 (F)orward
                 (B)ackward
                 (L)ist Places
                 (M)enu
                 (Q)uit""");
    }

    //add
    public static void addCity(LinkedList<CityAndDistance> city) {

        city.add(new CityAndDistance("Sydney", 0));
        city.add(new CityAndDistance("Adelaide", 1374));
        city.add(new CityAndDistance("Alice Springs", 2771));
        city.add(new CityAndDistance("Brisbane", 917));
        city.add(new CityAndDistance("Brisbane", 917));
        city.add(new CityAndDistance("Darwin", 3972));
        city.add(new CityAndDistance("Melbourne", 877));
        city.add(new CityAndDistance("Perth", 3923));
    }

    //check for dublicate and if there are, remove from the list
//    public static void checkForDublicate(LinkedList<CityAndDistance> city) {
//        for (int i = 0; i < city.size(); i++) {
//            for (int j = i + 1; j < city.size(); j++) {
//                if (city.get(i).getCityName().equals(city.get(j).getCityName())) {
//                    city.remove(j);
//                }
//            }
//        }
//    }
    public static void listPlaces(LinkedList<CityAndDistance> city) {


        ListIterator<CityAndDistance> iterator = city.listIterator(0);
        System.out.println("From Sydney");
        while (iterator.hasNext()){
            CityAndDistance nextCity = iterator.next();
            String nextCityName = nextCity.getCityName();
            int nextDistance = nextCity.getDistance();
            System.out.println("City - " + nextCityName + " are " + nextDistance + " km ");
        }
    }

    public static void checkForDublicate(LinkedList<CityAndDistance> city) {
        ListIterator<CityAndDistance> iterator = city.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(iterator.next())) {
                iterator.remove();
            }
        }
    }

    public static void goForward(LinkedList<CityAndDistance> city) {
        String firstCity = city.getFirst().getCityName();

        // Verificăm dacă iteratorul are următorul element
        if (iterator != null && iterator.hasNext()) {
            CityAndDistance nextCity = iterator.next();
            String nextCityName = nextCity.getCityName();
            int nextDistance = nextCity.getDistance();
            System.out.println("From ---> " + firstCity + " to " + nextCityName + " are " + nextDistance + " km ");
        } else {
            System.out.println("Nu mai există orașe disponibile.");
        }
    }

    public static void goBack(LinkedList<CityAndDistance> city) {
        String firstCity = city.getFirst().getCityName();

        if (iterator != null && iterator.hasPrevious()) {
            CityAndDistance previousCity = iterator.previous();
            String previousCityName = previousCity.getCityName();
            int previousCityDistance = previousCity.getDistance();
            System.out.println("From ---> " + firstCity + " to " + previousCityName + " are " + previousCityDistance + " km ");
        } else {
            System.out.println("Nu mai există orașe disponibile.");
        }
    }
}
