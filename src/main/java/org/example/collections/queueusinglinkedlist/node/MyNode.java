package org.example.collections.queueusinglinkedlist.node;

public class MyNode {

    private int data;
    private  MyNode next;
    public MyNode(int data){
        this.data = data;
        this.next = null;
    }

    /**
     * getter
     * @return data
     */
    public int getData() {
        return data;
    }

    /**
     * setter
     * @param data type int
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * getter
     * @return type MyNode next
     */
    public MyNode getNext() {
        return next;
    }

    /**
     * setter
     * @param next MyNode type
     */
    public void setNext(MyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
