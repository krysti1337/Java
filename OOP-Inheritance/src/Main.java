//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Maserati"); //validation functionality
        car.setModel("Carrera");
        car.setColor("Red");
        car.setDoors(4);
        car.setConvertible(true);


        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        System.out.println("color = " + car.getColor());
        car.describeCar();

        Car targa = new Car();

        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setColor("Green");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.describeCar();

    }
}