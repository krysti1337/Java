public class Car {
    private String description;
    private String name;
    private boolean isEngineStarted;

    public Car(String name){
        this.name = name;
    }

    public void startEngine(){
        System.out.println(" Start Engine ... ");
        isEngineStarted = true;
    }

    public void drive(){
        System.out.printf("%s The car is moving ", runEngine());
    }

    protected String runEngine(){
        String Engine;
        if(isEngineStarted == true){
            Engine = " The engine has been started and is working";
        } else{
            Engine = " The engine does not work, the car has not been started";
        }

        return Engine;
    }

    public static Car getCar(String description, String name){

       return switch (description.toUpperCase().charAt(0)){
           case 'E' -> new ElectricCar(name);
           case 'G' -> new GasPoweredCar(name);
           case 'H' -> new HybridCar(name);
           default ->  new Car(name);
       };
    }

    public void theCarIs(){

        String instanceDescription = this.getClass().getSimpleName();
        System.out.println(name + " is a " + instanceDescription + " car ");

    }

//    public void infoCar(){
//
//        String
//    }



}
