package dev.lpa;

public class CityAndDistance {

    private String cityName;
    private int distance;

    public CityAndDistance(String cityName, int distance) {
        this.cityName = cityName;
        this.distance = distance;
    }

    public String getCityName() {
        return cityName;
    }

    public int getDistance() {
        return distance;
    }

    public void getCityAndDistance(){
        System.out.println("City - " + getCityName() + " distance from Sydney  - " + getDistance() + " km");
    }


}
