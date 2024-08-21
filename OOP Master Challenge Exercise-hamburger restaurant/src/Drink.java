import java.util.Scanner;

public class Drink{
    protected String name;
    protected String size;
    protected double price;

    public Drink(){

    }
    protected void chooseDrink() {
        Scanner s = new Scanner(System.in);
        System.out.println("Meniu: 1 - Coca Cola, 2 - Pepsi, 3 - Fanta");
        switch (s.nextInt()) {
            case 1 -> {
                name = "Coca Cola";
                size = "small";
                price = 20.00;
            }
            case 2 -> {
                name = "Pepsi";
                size = "medium";
                price = 25.00;
            }
            case 3 -> {
                name = "Fanta";
                size = "large";
                price = 30.00;
            }
            default -> {
                name = "Unknown";
                size = "Unknown";
                price = 0.00;
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
