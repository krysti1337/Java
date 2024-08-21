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
        switch (s.nextLine()){
            case "1" ->{
                System.out.println("Pick the burger");
                this.burger.chooseBurger();
                System.out.println(this.burger.toString());
            }
            case "2" -> {
                System.out.println("Pick the drink");
                this.drink.chooseDrink();
                System.out.println(this.drink.toString());
            }
            case "3" -> {
                System.out.println("Pick the Side Item");
                this.sideItem.chooseSideItem();
                System.out.println(this.sideItem.toString());
            }
            default -> System.out.println("Invalid product type");
        }
    }

    public int getOption() {
        return option;
    }

}
