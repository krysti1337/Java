import java.util.Scanner;

public class Product {
    private int option;
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;
    private double finalPrice;

    public Product(){
        this.burger = new Burger();
        this.drink = new Drink();
        this.sideItem = new SideItem();
    }

    public void chooseOption(){
        Scanner s = new Scanner(System.in);
        System.out.println("1 -> Burger | 2 -> Drink | 3 -> Side Item");
        boolean running = true;
        while(running) {
            switch (s.nextLine()) {
                case "1" -> {
                    System.out.println("Pick the burger");
                    this.burger.chooseBurger();
                    System.out.println(this.burger.toString());
                    System.out.println(" ");
                    chooseOption();
                }
                case "2" -> {
                    System.out.println("Pick the drink");
                    this.drink.chooseDrink();
                    System.out.println(this.drink.toString());
                    System.out.println(" ");
                    chooseOption();
                }
                case "3" -> {
                    System.out.println("Pick the Side Item");
                    this.sideItem.chooseSideItem();
                    System.out.println(this.sideItem.toString());
                    System.out.println(" ");
                    chooseOption();
                }
                case "0" ->{
                    running = false;
                    System.out.println(" ");
                    System.out.println(toString());
                }
                default -> System.out.println("Invalid product type");
            }
        }
    }

    public int getOption() {
        return option;
    }

    public double getFinalPrice() {
        return finalPrice = burger.price + drink.price + sideItem.price;
    }

    @Override
    public String toString() {
        return "Product{" +
                ", burger ->" + burger +
                ", drink ->" + drink +
                ", sideItem ->" + sideItem +
                ", finalPrice ->" + getFinalPrice() +
                '}';
    }
}
