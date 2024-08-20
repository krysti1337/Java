public class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    @Override
    public void theCarIs() {
        super.theCarIs();
        super.theCarIs();
        System.out.printf("..%s%n".repeat(2),
                "this car have %s cylinders and %s battery size".formatted(cylinders, batterySize),
                "average Km per litre is %s".formatted(avgKmPerLitre));
    }

    public HybridCar(String name){
        super(name);
    }
}
