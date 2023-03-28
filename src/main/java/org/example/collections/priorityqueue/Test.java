package org.example.collections.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        PriorityQueueEx<Object> priorityQueueEx = new PriorityQueueEx<>();

        priorityQueueEx.addingInPriorityQueue("string1");
        priorityQueueEx.addingInPriorityQueue("string4");
        priorityQueueEx.addingInPriorityQueue("string3");
        priorityQueueEx.print();
        priorityQueueEx.removeInPriorityQueue();
        priorityQueueEx.print();


        PriorityQueueEx<Object> priorityQueueEx1 = new PriorityQueueEx<>();
        priorityQueueEx1.addingInPriorityQueue(1);
        priorityQueueEx1.addingInPriorityQueue(5);
        priorityQueueEx1.addingInPriorityQueue(13);
        priorityQueueEx1.addingInPriorityQueue(10);
        priorityQueueEx1.print();
        priorityQueueEx1.removeAllInPriorityQueue();
        priorityQueueEx1.print();


        PriorityQueueEx<Object> colors = new PriorityQueueEx<>();
        colors.addingInPriorityQueue("red");
        colors.addingInPriorityQueue("green");
        colors.addingInPriorityQueue("blue");
        colors.addingInPriorityQueue("yellow");
        colors.print();


        PriorityQueue<Object> que = new PriorityQueue<>();
        colors.copyQue(que);
        System.out.println("Elements of que are: ");
        while (!que.isEmpty()) {
            System.out.print(que.poll()+" ");
        }
        System.out.println();


        PriorityQueueEx<Object> maxQueue = new PriorityQueueEx<>();
        maxQueue.maxPriority();
        maxQueue.addingInPriorityQueue(2);
        maxQueue.addingInPriorityQueue(20);
        maxQueue.addingInPriorityQueue(15);
        maxQueue.addingInPriorityQueue(0);
        maxQueue.print();
        System.out.println("Elements of the maximum priority queue are");
        maxQueue.removeAllInPriorityQueue();

    }
}
