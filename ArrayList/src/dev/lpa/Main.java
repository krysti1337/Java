package dev.lpa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString(){
        return String.format("%d%s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {

    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);

        System.out.println(Arrays.toString(groceryArray)); //[GroceryItem[name=milk, type=DAIRY, count=1], GroceryItem[name=apples, type=PRODUCE, count=6], GroceryItem[name=oranges, type=PRODUCE, count=5]]

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
//        System.out.println(groceryList); //[GroceryItem[name=Butter, type=DAIRY, count=1], GroceryItem[name=milk, type=DAIRY, count=1], GroceryItem[name=oranges, type=PRODUCE, count=5]]

//        groceryList.add(0,
//                new GroceryItem("apples", "PRODUCE", 6));

//      [1MILK in DAIRY, 6APPLES in PRODUCE, 5ORANGES in PRODUCE]
//      [1BUTTER in DAIRY, 1MILK in DAIRY, 5ORANGES in PRODUCE]
//      [6APPLES in PRODUCE, 1BUTTER in DAIRY, 1MILK in DAIRY, 5ORANGES in PRODUCE]

//        groceryList.set(0,
//                new GroceryItem("FRUIT", "PRODUCE", 6));


//        [1MILK in DAIRY, 6APPLES in PRODUCE, 5ORANGES in PRODUCE]
//        [1BUTTER in DAIRY, 1MILK in DAIRY, 5ORANGES in PRODUCE]
//        [6FRUIT in PRODUCE, 1BUTTER in DAIRY, 1MILK in DAIRY, 5ORANGES in PRODUCE]
        groceryList.set(0,
                new GroceryItem("APPLES", "PRODUCE", 6));
        groceryList.remove(1);
        System.out.println(groceryList);
//        [1MILK in DAIRY, 6APPLES in PRODUCE, 5ORANGES in PRODUCE]
//        [6APPLES in PRODUCE, 5ORANGES in PRODUCE]
    }
}
