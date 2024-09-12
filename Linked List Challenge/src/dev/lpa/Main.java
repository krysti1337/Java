package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<CityAndDistance> city = new LinkedList<>();

        addCity(city);
        checkForDublicate(city);
        for (CityAndDistance town : city) {
            town.getCityAndDistance();
        }

        goForward(city);
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
    public static void checkForDublicate(LinkedList<CityAndDistance> city) {
        for (int i = 0; i < city.size(); i++) {
            for (int j = i + 1; j < city.size(); j++) {
                if (city.get(i).getCityName().equals(city.get(j).getCityName())) {
                    city.remove(j);
                }
            }
        }
    }

    public static CityAndDistance goForward(LinkedList<CityAndDistance> city) {
        String previousTown = city.getFirst().getCityName();
        ListIterator<CityAndDistance> iterator = city.listIterator(1);
        var nextCityName = iterator.next().getCityName();
        var nextDistance = iterator.next().getDistance();
        CityAndDistance nextCity = new CityAndDistance(nextCityName, nextDistance);
        System.out.println("Trip starts at -> " + city.getFirst().getCityName() + " Next City -> " + nextCityName + " distance " + nextDistance + " km");
        return nextCity;
    }
}
