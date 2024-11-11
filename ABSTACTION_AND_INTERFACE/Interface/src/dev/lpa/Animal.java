package dev.lpa;

enum FlightStages implements Trackable{GROUNDED, LAUNCH, CURISE, DATA_COLLECITON;


    @Override
    public void track() {
        if (this != GROUNDED){
            System.out.println("Monitoring " + this);
        }
    }
}

record DragonFly(String name, String type) implements  FlightEnable{


    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth{

    public void achieveOrbit(){
        System.out.println("Orbit achieved !");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
interface OrbitEarth extends FlightEnable{

    void achieveOrbit();
}

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
