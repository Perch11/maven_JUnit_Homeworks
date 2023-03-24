package org.example.collections.stackt;

import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> stack;

    /**
     * Constructor
     */
    public Stack() {
        this.stack = new ArrayList<>();
    }

    /**
     * this method adds an element in arraylist
     * @param item type T
     */
    public void push(T item) {
        this.stack.add(item);
    }

    /**
     * this method removes an element in arraylist
     * @return type t
     */
    public T pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return this.stack.remove(this.stack.size() - 1);
    }

    /**
     * clears the array list
     */
    public void isEmpty() {
         this.stack.clear();
    }

    /**
     * getter
     * @return type T
     */
    public ArrayList<T> getStack() {
        return stack;
    }
}
