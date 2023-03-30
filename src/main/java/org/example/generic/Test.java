package org.example.generic;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Integer[] array = {5, 8, 6, 9, 7, 8, 7, 0};
        String[] array1 = {"Armen", "Karen", "Hakob", "Miqo", "Lilit"};
        var ex = new GenericEx<>();


        Object[] arr = ex.exchangeTwoElementsPosition(array, 2, 6);
        ex.printArray(arr);
        System.out.println();
        Object[] arr2 = ex.exchangeTwoElementsPosition(array1, 2, 0);
        ex.printArray(arr2);
        System.out.println();


        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(15);
        list.add(7);
        list.add(8);
        list.add(8);
        list.add(9);
        list.add(5);
        System.out.println(list + " -> array list");

        System.out.println(ex.findMaxElement(list) + " -> is max in array list");

    }
}
