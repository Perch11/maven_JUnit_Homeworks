package org.example.collections.queueusinglinkedlist.secondoption;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<T> {
    private LinkedList<T> list;

    /**
     * constructor
     */
    public MyQueue() {
        list = new LinkedList<>();
    }

    /**
     * Add an element to the back of the queue
     * @param item type T
     */
    public void enqueue(T item) {
        list.addLast(item);
    }

    /**
     * Remove and return the front element of the queue.
     * @return type T
     */
    public T dequeue() {
        if (list.isEmpty()) {
            return null;
        }
        return list.removeFirst();
    }

    /**
     * Return the front element of the queue without removing it. If the queue is empty, return null.
     * @return type T
     */
    public T peek() {
        if (list.isEmpty()) {
            return null;
        }
        return list.getFirst();
    }

    /**
     * Return true if the queue is empty, false otherwise
     * @return type boolean
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * return size of list
     * @return type int
     */
    public int size() {
        return list.size();
    }

    /**
     * gettr
     * @return type- LinkedList
     */
    public LinkedList<T> getList() {

        return list;
    }
    public boolean check(T item){
        return list.contains(item);
    }

    /**
     * iterate Elements In LinkedList
     * throws exception when list isEmpty
     */
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

    /**
     * setter
     * @param list LinkedList type
     */
    public void setList(LinkedList<T> list) {
        this.list = list;
    }


}
