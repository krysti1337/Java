import java.util.Scanner;

public class Burger{
    protected String name;
    protected String size;
    protected double price;

    public Burger() {
    }

    protected void chooseBurger() {
        Scanner s = new Scanner(System.in);
        System.out.println("Meniu: 1 - American Burger, 2 - Chicken Burger, 3 - Classic Cheeseburger, 4 - El Gran Matador");
        switch (s.nextLine()) {
            case "1" -> {
                name = "American Burger";
                size = "regular";
                price = 64.00;
            }
            case "2" -> {
                name = "Chicken Burger";
                size = "mid";
                price = 74.00;
            }
            case "3" -> {
                name = "Classic Cheeseburger";
                size = "regular";
                price = 68.00;
            }
            case "4" -> {
                name = "El Gran Matador";
                size = "big";
                price = 104.00;
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
        return "price=" + price +
                ", size='" + size + '\'' +
                ", name='" + name + '\'' +
                " ";
    }
}
