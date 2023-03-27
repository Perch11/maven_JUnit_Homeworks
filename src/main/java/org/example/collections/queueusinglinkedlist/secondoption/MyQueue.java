package org.example.collections.queueusinglinkedlist.secondoption;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<T> {
    private LinkedList<T> list;

    public MyQueue() {
        list = new LinkedList<>();
    }

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        if (list.isEmpty()) {
            return null;
        }
        return list.removeFirst();
    }

    public T peek() {
        if (list.isEmpty()) {
            return null;
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public LinkedList<T> getList() {

        return list;
    }

    public void Sout() {
        if (isEmpty()) {
            throw new IllegalArgumentException();
        }
        for (T s : list
        ) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void setList(LinkedList<T> list) {
        this.list = list;
    }


}
