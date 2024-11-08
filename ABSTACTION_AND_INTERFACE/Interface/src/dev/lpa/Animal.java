package dev.lpa;

interface FlightEnable{

    public static final double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    public abstract void takeOff();
    abstract void land();
    void fly();

    //toate declaritiile de methode de sus sunt corecte, pentru ca in interface sunt declarate implicit ca public abstract, modifierul de protected nu este permis in interface
};

interface Trackable{

    void track();
};

public abstract class Animal {

    public abstract void move();

}
