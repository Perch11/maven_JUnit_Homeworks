package org.example.collections.linkedlistmethods;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class MyLinkedLIst {

    public void iterateElementsInLinkedList(LinkedList<String> list) {

        for (String s : list
        ) {
            System.out.print(s + " ");
        }
    }

    public void reverseOrder(LinkedList<String> list){
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            String element = iterator.previous();
            System.out.print(element + " ");
        }
    }
    public void addFirstAndLastPosition(LinkedList<String> list){
        list.addFirst("Ashot");
        list.addLast("Hakob");
    }
    public void removeFirstAndLastPosition(LinkedList<String> list){
        list.removeFirst();
        list.removeLast();
    }

}
