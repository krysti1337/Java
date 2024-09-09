package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> placeToVisit = new LinkedList<>();

        placeToVisit.add("Sydney");
        placeToVisit.add(0, "Canberra");
        System.out.println(placeToVisit);

        addMoreElements(placeToVisit);
        System.out.println(placeToVisit);
        ;

//        removeElements(placeToVisit);
//        System.out.println(placeToVisit);

//        gettingElements(placeToVisit);

        printItinerary(placeToVisit);
        printItinerary2(placeToVisit);
        printItinerary3(placeToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {

        list.addFirst("Darwin");
        list.addLast("Hobart");
        //Queue methods
        list.offer("Melbourne"); //[Darwin, Canberra, Sydney, Hobart, Melbourne]
        list.offerFirst("Brisbane"); //[Brisbane, Darwin, Canberra, Sydney, Hobart, Melbourne]
        list.offerLast("Toowoomba"); //[Brisbane, Darwin, Canberra, Sydney, Hobart, Melbourne, Toowoomba]
        //Stack methods
        list.push("Alice Springs"); //[Alice Springs, Brisbane, Darwin, Canberra, Sydney, Hobart, Melbourne, Toowoomba]
    }

    private static void removeElements(LinkedList<String> list) {

        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed First element");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed Last element");
//        Alice Springs was removed
//        Darwin was removed First element
//        Toowoomba was removed Last element
//        [Canberra, Hobart, Melbourne]

        //Queue/Deque poll methods
        String p1 = list.poll();
        System.out.println(p1);

        String p2 = list.pollFirst();
        System.out.println(p2);

        String p3 = list.pollLast();
        System.out.println(p3);
//      Darwin was removed First element
//      Toowoomba was removed Last element
//      Canberra
//      Hobart
//      Melbourne
//      []

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");

        String p4 = list.pop();
        System.out.println(p4 + " was removed");

//      Canberra was removed
//      [Brisbane, Sydney]
    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4)); //O(n)

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin is at position : " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position : " + list.lastIndexOf("Melbourne"));

        //Queue retrieval method
        System.out.println("Element from element() = " + list.element());

        //Stack retrieval method
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekLast() = " + list.peekLast());
        System.out.println("Element from peekFirst() = " + list.peekFirst());

    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("---> From: " + list.get(i-1) + " to " + list.get(i));
//            ---> From: Alice Springs to Brisbane
//            ---> From: Brisbane to Darwin
//            ---> From: Darwin to Canberra
//            ---> From: Canberra to Sydney
//            ---> From: Sydney to Hobart
//            ---> From: Hobart to Melbourne
//            ---> From: Melbourne to Toowoomba
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list){
            System.out.println("---> From: " + previousTown + " to " + town);
            previousTown = town;
            //Same output
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println("---> From: " + previousTown + " to " + town);
            previousTown = town;
            //Same output
        }
        System.out.println("Trip ends at " + list.getLast());
    }
}
