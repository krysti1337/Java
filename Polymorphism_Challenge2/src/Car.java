public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }


    public String startEngine(){
        String carName = this.getClass().getSimpleName() + " -> startEngine()"; //ii da la variabila carName numele clasei curente
        return carName;
    }

    public String accelerate(){
        String carName = this.getClass().getSimpleName()  + " -> accelerate()";
        return carName;
    }

    public String brake(){
        String carName = this.getClass().getSimpleName() + " -> brake()";
        return carName;
    }
}
