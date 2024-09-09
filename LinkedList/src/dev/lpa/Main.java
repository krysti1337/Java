package dev.lpa;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> placeToVisit = new LinkedList<>();

        placeToVisit.add("Sydney");
        placeToVisit.add(0, "Canberra");
        System.out.println(placeToVisit);

        addMoreElements(placeToVisit);
        System.out.println(placeToVisit);;

        removeElements(placeToVisit);
        System.out.println(placeToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){

        list.addFirst("Darwin");
        list.addLast("Hobart");
        //Queue methods
        list.offer("Melbourne"); //[Darwin, Canberra, Sydney, Hobart, Melbourne]
        list.offerFirst("Brisbane"); //[Brisbane, Darwin, Canberra, Sydney, Hobart, Melbourne]
        list.offerLast("Toowoomba"); //[Brisbane, Darwin, Canberra, Sydney, Hobart, Melbourne, Toowoomba]
        //Stack methods
        list.push("Alice Springs"); //[Alice Springs, Brisbane, Darwin, Canberra, Sydney, Hobart, Melbourne, Toowoomba]
    }

    private static void removeElements(LinkedList<String> list){

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
}
