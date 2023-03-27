package org.example.collections.queueusinglinkedlist.queue;

import org.example.collections.queueusinglinkedlist.node.MyNode;

public class MyQueue {
    private MyNode rear;

    private MyNode front;

    private int size;

    /**
     * Return true if the queue is empty, false otherwise
     * @return type boolean
     */
    public boolean isEmpty() {
        boolean bool = false;
        if (size == 0) {
            bool = true;
        }
        return bool;
    }

    /**
     * Add an element to the back of the queue
     * @param element type int
     */
    public void enqueue(int element) {
        MyNode node = new MyNode(element);
        if (this.front == null) {
            front = rear = node;
            size++;
        } else {
            rear.setNext(node);
            rear = node;
            size++;
        }
    }

    /**
     * Constructor
     */
    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    /**
     * Remove and return the front element of the queue.
     * @return type MyNode
     */
     public MyNode dequeue(){
        MyNode temp = null;
        if(front != null){
            if(front.getNext()!= null){
                temp = new MyNode(front.getData());
                front = front.getNext();
                size--;
            }
            else {
                temp = new MyNode(front.getData());
                front=null;
                rear=null;
                size--;
            }
        }
        return temp;
     }

    /**
     * Return the front element of the queue without removing it. If the queue is empty, return null.
     * @return type MyNode
     */
     public MyNode peek(){
        MyNode temp = null;
        if(!isEmpty()){
            temp = new MyNode(front.getData());

        }
        return temp;
     }

    /**
     * getter Size
     * @return int type
     */
    public int getSize() {
        return size;
    }

    /**
     * override toString method
     * @return type String
     */
    @Override
    public String toString() {
        return "MyQueue{" +
                "rear=" + rear +
                ", front=" + front +
                '}';
    }
}
