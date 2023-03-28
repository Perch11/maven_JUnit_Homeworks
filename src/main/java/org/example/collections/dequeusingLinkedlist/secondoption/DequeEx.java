package org.example.collections.dequeusingLinkedlist.secondoption;

import java.util.Deque;
import java.util.LinkedList;

public class DequeEx<T> {
    Deque<T> deque;

    public DequeEx() {
        this.deque = new LinkedList<>();
    }

    public void addElementInDeque(T element) {
        deque.add(element);
    }

    public void addFirstElementInDeque(T element) {
        deque.addFirst(element);
    }

    public void addLastElementInDeque(T element) {
        deque.addLast(element);
    }

    public void print() {
        System.out.println(deque);
    }

    public void removeElementInDeque(T element) {
        deque.remove(element);
    }

    public void removeFirstElementInDeque() {
        deque.removeFirst();
    }

    public void removeLastElementInDeque(T element) {
        deque.removeLast();
    }

    public T removeAllElementInDeque() {
        while (!deque.isEmpty()) {
            System.out.println(deque.remove());
        }

        return null;
    }

}
