package org.example.collections.linkedlistmethods;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        MyLinkedLIst myLinkedLIst = new MyLinkedLIst();

        LinkedList<String> list = new LinkedList<>();
        list.add("Aram");
        list.add("Armen");
        list.add("Davo");
        list.add("Aram");
        list.add("Artur");
        //10
        myLinkedLIst.iterateElementsInLinkedList(list);
        System.out.println();
        //11
        myLinkedLIst.reverseOrder(list);
        System.out.println();
        //12
        myLinkedLIst.addFirstAndLastPosition(list);
        System.out.println(list);
        System.out.println();
        //13
        list.addLast("Garnik");
        System.out.println(list);
        System.out.println();
        //14
        System.out.println(list);
        myLinkedLIst.removeFirstAndLastPosition(list);
        System.out.println(list);
        System.out.println();
        //15
        LinkedList<String> list1;
        list1 = (LinkedList<String>) list.clone();
        System.out.println(list1);
        System.out.println();
        //16
        LinkedList<String> list2 = new LinkedList<>();

        System.out.println("Is list2 empty? " + list2.isEmpty());
        list2.add("ar");
        System.out.println(list2.isEmpty());
        System.out.println(list2);

        System.out.println("Is list1 empty? " + list1.isEmpty());
        System.out.println();

    }
}
