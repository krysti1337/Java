public class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name){
        super(name);
    }

    @Override
    public void theCarIs() {
        super.theCarIs();
        System.out.printf("..%s%n".repeat(2),
                "this car have %s".formatted(batterySize),
                "average Km per litre is %s".formatted(avgKmPerCharge));
    }
}
