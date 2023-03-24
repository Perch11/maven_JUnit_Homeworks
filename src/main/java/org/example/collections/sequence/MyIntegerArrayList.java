package org.example.collections.sequence;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MyIntegerArrayList {
    /**17
     * This method calculates sum of the list.
     * @param list - ArrayList
     * @return type integer
     * throws exception when list is empty
     */
    public int sum(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("list is empty");
        }
        int sum = 0;
        for (Integer i : list
        ) {
            sum += i;
        }

        return sum;
    }

    /**18
     * This method calculates average sum of the list
     * @param sum int type
     * @param list ArrayList
     * @return double type
     * throws exception when list is empty
     */
    public double average(int sum, ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("list is empty");
        }

        return (double) sum / list.size();
    }

    /**19
     * removes negative elements in arraylist
     * @param list ArrayList
     */

    public void removeAllNegatives(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 0) {
                iterator.remove();
            }
        }
    }

//    public void removeAllNegatives1(ArrayList<Integer> list) {
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next() < 0) {
//                iterator.remove();
//            }
//        }
//    }
}


