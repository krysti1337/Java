public class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name){
        super(name);
    }

    @Override
    public void theCarIs() {
        super.theCarIs();
        System.out.printf("..%s%n".repeat(2),
                "this car have %s".formatted(cylinders),
                "average Km per litre is %s".formatted(avgKmPerLitre));
    }
}
