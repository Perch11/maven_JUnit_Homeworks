package org.example.collections.priorityqueue.costomobjects;

import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Person> personQueue = new PriorityQueue<>();


        personQueue.add(new Person("Arman", 25));
        personQueue.add(new Person("Rob", 18));
        personQueue.add(new Person("Ani", 20));
        personQueue.add(new Person("David", 35));
        personQueue.add(new Person("David", 54));

        while (!personQueue.isEmpty()) {
            System.out.println(personQueue.poll());
        }
    }
}
