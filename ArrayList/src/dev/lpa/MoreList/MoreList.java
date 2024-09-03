package dev.lpa.MoreList;

import java.util.ArrayList;
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
    }
}
