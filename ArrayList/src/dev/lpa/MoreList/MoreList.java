package dev.lpa.MoreList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {
    public static void main(String[] args) {
        String[] items = {"apples", "bananas", "milk"};

        List<String> list = List.of(items); //creaza o lista imutabila
        System.out.println(list);

//        System.out.println(list.getClass().getName());
//        list.add("yogurt"); //at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)

        ArrayList<String> groceries = new ArrayList<>(list); //cream un array list din "list" care este mutabil
        groceries.add("yogurt");
        System.out.println(groceries); //[apples, bananas, milk, yogurt]

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList); //[pickles, mustard, cheese]

        groceries.addAll(nextList);
        System.out.println(groceries); //[apples, bananas, milk, yogurt, pickles, mustard, cheese]

        System.out.println("Third item = " + groceries.get(2)); // Third item = milk

        if(groceries.contains("mustard")){
            System.out.println("List contains mustard"); //List contains mustard
        }

        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));
//        first = 3
//        last = 7

        System.out.println(groceries);
        groceries.remove(1); //sterge dupa index
        System.out.println(groceries);
        groceries.remove("yogurt"); //sterge dupa date
        System.out.println(groceries);

//        [apples, bananas, milk, yogurt, pickles, mustard, cheese, yogurt]
//        [apples, milk, yogurt, pickles, mustard, cheese, yogurt]
//        [apples, milk, pickles, mustard, cheese, yogurt]

        groceries.removeAll(List.of("apples", "eggs")); //sterge toate elementele din lista cu asa nume
        System.out.println(groceries);
//        [milk, pickles, mustard, cheese, yogurt]

        groceries.retainAll(List.of("apples","milk","mustard","cheese")); //sterge toate ca nu sunt aceste elemente si le lasa doar pe ele
        System.out.println(groceries);
//        [milk, mustard]

        groceries.clear(); //sterge tot
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());
//        []
//        isEmpty = true

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        System.out.println(groceries);
//        [apples, milk, mustard, cheese, eggs, pickles, mustard, ham]

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
//        [apples, cheese, eggs, ham, milk, mustard, mustard, pickles]

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);
//        [pickles, mustard, mustard, milk, ham, eggs, cheese, apples]

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
//        [pickles, mustard, mustard, milk, ham, eggs, cheese, apples]
    }
}
