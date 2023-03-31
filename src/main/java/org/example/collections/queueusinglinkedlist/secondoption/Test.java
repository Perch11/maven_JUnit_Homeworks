package org.example.collections.queueusinglinkedlist.secondoption;



public class Test {

    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        System.out.println(queue.isEmpty());
        queue.enqueue("ashot");
        queue.enqueue("ashot");


        queue.enqueue("ashot");
        queue.enqueue("ashot");
        queue.enqueue("kar");
        queue.Sout();
        System.out.println(queue.size());
        String element = "kar";
        if(queue.check(element)){
            System.out.println("element present in the queue");
        }else {
            System.out.println("element do not present in the queue");
        }

    }
}
