package org.example.collections.dequeusingLinkedlist.secondoption;

import java.util.Deque;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        DequeEx<Object> deque = new DequeEx<>();
        deque.addElementInDeque(8);
        deque.addElementInDeque(8);
        deque.addElementInDeque(8);
        deque.addElementInDeque(8);
        deque.print();
        deque.addLastElementInDeque(7);
        deque.addFirstElementInDeque(7);
        deque.print();
        deque.removeAllElementInDeque();
        deque.print();
    }
}
