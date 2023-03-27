package org.example.collections.queueusinglinkedlist;

import org.example.collections.queueusinglinkedlist.queue.MyQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(6);
        queue.enqueue(7);
        System.out.println(queue.getSize());
        System.out.println(queue.peek().getData() +" first element");
        queue.enqueue(8);
        queue.enqueue(8);
        queue.enqueue(8);
        queue.enqueue(8);
        System.out.println(queue.dequeue().getData() +" deleted element");
        System.out.println(queue.getSize() + " size");
        System.out.println(queue.toString());

    }
}
