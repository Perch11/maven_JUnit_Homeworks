package org.example.collections.dequeusingLinkedlist;

import org.example.collections.dequeusingLinkedlist.deque.MyDeque;

public class Test {

    public static void main(String[] args) {
        MyDeque<String> deque = new MyDeque<>();
        deque.addFirst("armen");
        deque.addFirst("karo");
        deque.print();
        deque.removeLast();
        deque.addLast("lilit");
        deque.print();

    }

}
