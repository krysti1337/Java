package dev;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class lpa {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        List<String> arrayList = new ArrayList<>();
        while (flag) {
            System.out.println("0 - to shutdown, 1 - to add item(s) to list, 2 - to remove item(s)");
            switch (s.nextInt()) {
            case 1 -> {
                addItem(arrayList);
            }
            case 2 -> removeItem(arrayList);
            case 0 -> flag = false;
                default -> System.out.println("Invalid input");
            }
        }
    }

    public static List<String> addItem(List<String> arrayList) {
        Scanner s = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Introduceti valorile: ");
        while (flag) {
            String input = s.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                flag = false;
            } else if (arrayList.contains(input)) {
                System.out.println("Elementul " + input + " este deka in lista! Introduceti altul :");
            }else {
                arrayList.add(input);
            }

        }

        arrayList.sort(Comparator.naturalOrder());
        System.out.println("arrayList = " + arrayList);

        return arrayList;
    }

    public static void removeItem(List<String> list) {
        list.sort(Comparator.naturalOrder());
        System.out.println("Lista este : " + list);
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti elementul care vreti sa fie sters : ");
        String element = s.nextLine();

        if (list.contains(element)) {
            list.remove(element);
            System.out.println("Elementul " + element + " a fost sters");
        } else {
            System.out.println("Elementul" + element + " nu a fost gasit");
        }

        list.sort(Comparator.naturalOrder());
        System.out.println("arrayList = " + list);
    }


}
