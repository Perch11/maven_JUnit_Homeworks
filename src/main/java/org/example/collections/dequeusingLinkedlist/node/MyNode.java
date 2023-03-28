package org.example.collections.dequeusingLinkedlist.node;

public class MyNode<T> {
    private T val;
    private MyNode<T> prev;
    private MyNode<T> next;

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public MyNode<T> getPrev() {
        return prev;
    }

    public void setPrev(MyNode<T> prev) {
        this.prev = prev;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    public MyNode(T val) {
        this.val = val;
        prev = next = null;
    }
}
