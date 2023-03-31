package org.example.generic;

import java.util.ArrayList;

public class GenericEx<T> {
    /**
     * this method exchange the positions of two different elements in an array.
     * @param array generic type
     * @param index1 int type
     * @param index2 int type
     * @return generic type
     */
    public T[] exchangeTwoElementsPosition(T[] array, int index1, int index2) {
        if (array.length == 0) {
            throw new NullPointerException("array is empty");
        }

        if (index1 == index2) {
            return array;
        }

        if (index1 < 0 || index1 > array.length || index2 < 0 || index2 > array.length) {
            throw new IllegalArgumentException("illegal index");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        return array;
    }

    /**
     * This method returns maximum element in ArrayList
     * @param list type generic ArrayList
     * @return generic max element in arraylist
     * @param <T>
     */
    public <T extends Comparable> T findMaxElement(ArrayList<T> list){
        T max = list.get(0);
        for (int i = 1; i < list.size() - 1 ; i++) {
            T element = list.get(i);
            if (element.compareTo(max) > 0) {
                max = element;
            }

        }
        return max;
    }

    /**
     * this method prints an array
     *
     * @param array generic type
     */
    public void printArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
    }
}
