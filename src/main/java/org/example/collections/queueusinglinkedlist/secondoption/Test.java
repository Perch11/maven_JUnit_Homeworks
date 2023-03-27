package org.example.collections.queueusinglinkedlist.secondoption;



public class Test {

    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        System.out.println(queue.isEmpty());
        queue.enqueue("ashot");
        queue.enqueue("ashot");

        queue.Sout();
        queue.enqueue("ashot");
        queue.enqueue("ashot");
        queue.enqueue("ashot");
        System.out.println(queue.size());

    }
}
