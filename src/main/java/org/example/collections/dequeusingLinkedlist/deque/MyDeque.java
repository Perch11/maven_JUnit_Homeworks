package org.example.collections.dequeusingLinkedlist.deque;

import org.example.collections.dequeusingLinkedlist.node.MyNode;

import java.util.NoSuchElementException;

public class MyDeque<T> {
    MyNode<T> front;
    MyNode<T> rear;

    public MyDeque() {
        front = rear = null;
    }

    public void addFirst(T val) {
        MyNode<T> node = new MyNode<>(val);
        if (front == null) {
            front = rear = node;
        } else {
            node.setNext(front);
            front.setPrev(node);
            front = node;
        }
    }

    public void addLast(T val) {
        MyNode<T> node = new MyNode<>(val);
        if (rear == null) {
            front = rear = node;
        } else {
            node.setPrev(rear);
            rear.setNext(node);
            rear = node;
        }
    }

    public T removeFirst() {
        if (front == null) {
            throw new NoSuchElementException("Deque is empty");
        }
        T val = front.getVal();
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.getNext();
            front.setPrev(null);
        }
        return val;
    }

    public T removeLast() {
        if (rear == null) {
            throw new NoSuchElementException("Deque is empty");
        }
        T val = rear.getVal();
        if (front == rear) {
            front = rear = null;
        } else {
            rear = rear.getPrev();
            rear.setNext(null);
        }
        return val;
    }

    public boolean isEmpty() {
        return front == null && rear == null;
    }

    public int size() {
        int count = 0;
        MyNode<T> curr = front;
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }
        return count;
    }

    public void print() {
        MyNode<T> temp = front;
        while (temp != null) {
            System.out.print(temp.getVal() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
