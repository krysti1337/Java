import java.util.Scanner;

public class GasPoweredCar extends Car{
    private double avgKmPerLitre;
    private int cylinders;


    public GasPoweredCar(String name){
        super(name);
    }


    @Override
    public void infoAboutCar() {
        super.infoAboutCar();
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter average Km per litre :");

        avgKmPerLitre = Double.parseDouble(s.nextLine());

        System.out.println(" Enter number of cylinders : ");

        cylinders = Integer.parseInt(s.nextLine());

        System.out.printf("..%s%n".repeat(2),
                "this car have %s".formatted(cylinders) + " cylinders",
                "average Km per litre is %s".formatted(avgKmPerLitre));

    }

    @Override
    public void theCarIs() {
        super.theCarIs();

    }
}
