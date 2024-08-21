import java.util.Scanner;

public class SideItem{
    protected String name;
    protected String size;
    protected double price;

    public SideItem(){

    }

    protected void chooseSideItem() {
        Scanner s = new Scanner(System.in);
        System.out.println("Meniu: 1 - Fries, 2 - Onion Rings, 3 - Nuggets");
        switch (s.nextInt()) {
            case 1 -> {
                name = "Fries";
                size = "small";
                price = 15.00;
            }
            case 2 -> {
                name = "Onion Rings";
                size = "medium";
                price = 20.00;
            }
            case 3 -> {
                name = "Nuggets";
                size = "large";
                price = 25.00;
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
        return "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                " ";
    }
}
