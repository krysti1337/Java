import java.util.Scanner;

public class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name){
        super(name);
    }

    @Override
    public void infoAboutCar() {
        super.infoAboutCar();
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter average Km per litre :");

        avgKmPerCharge = Double.parseDouble(s.nextLine());

        System.out.println(" Enter number of cylinders : ");

        batterySize = Integer.parseInt(s.nextLine());

        System.out.printf("..%s%n".repeat(2),
                "this car have %s".formatted(batterySize) + " battery size",
                "average Km per litre is %s".formatted(avgKmPerCharge));

    }
}
