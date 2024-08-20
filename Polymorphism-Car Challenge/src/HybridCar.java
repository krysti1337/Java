import java.util.Scanner;

public class HybridCar extends Car{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    @Override
    public void infoAboutCar() {
        super.infoAboutCar();
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter average Km per litre :");

        avgKmPerLitre = Double.parseDouble(s.nextLine());

        System.out.println(" Enter number of cylinders : ");

        cylinders = Integer.parseInt(s.nextLine());

        System.out.println(" Enter battery size :");

        System.out.printf("..%s%n".repeat(3),
                "this car have %s".formatted(cylinders) + " cylinders",
                "this car also have".formatted(batterySize)+ " battery size",
                "average Km per litre is %s".formatted(avgKmPerLitre));

    }

    @Override
    public void theCarIs() {
        super.theCarIs();

    }
    public HybridCar(String name){
        super(name);
    }
}
