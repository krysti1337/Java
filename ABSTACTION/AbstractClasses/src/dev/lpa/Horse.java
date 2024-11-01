package dev.lpa;

public class Horse extends Mammal{

    public Horse(String type, String size, String weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {
        System.out.println(getExplicitType() + " sheds in the spring");
    }

    @Override
    public void shedHair() {

    }

}
