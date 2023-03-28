package org.example.collections.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx<T> {

    PriorityQueue<T> queue;

    public PriorityQueueEx() {

        queue = new PriorityQueue<>();
    }

    public PriorityQueue<T> getQueue() {
        return queue;
    }

    public void setQueue(PriorityQueue<T> queue) {
        this.queue = queue;
    }

    public void addingInPriorityQueue(T element) {

        queue.add(element);

    }

    public void removeInPriorityQueue() {
        queue.remove();
    }

    public void removeAllInPriorityQueue() {
        while (!queue.isEmpty())
            System.out.println(queue.remove());
    }

    public void print() {
        System.out.println(queue);
    }

    public void maxPriority() {
        queue = new PriorityQueue(Comparator.reverseOrder());
    }

    public void copyQue(PriorityQueue<T> que) {
        que.addAll(queue);
    }


}
