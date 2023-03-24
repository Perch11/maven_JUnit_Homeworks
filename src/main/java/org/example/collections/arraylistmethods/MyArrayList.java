package org.example.collections.arraylistmethods;


import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {

    public void iterateElementsInArrayList(ArrayList<String> list) {

        for (String s : list
        ) {
            System.out.print(s + " ");
        }
    }

    public void insertInArrayList(ArrayList<String> list) {
        list.add(0, "saqo");
    }

    public void updateInArrayList(ArrayList<String> list) {
        list.set(0, "arman");
    }

    public void searchElementInArrayList(ArrayList<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                System.out.println("in array list " + i + "th element = " + target);
                return;
            }
        }
        System.out.println("not found!!!!");
    }

    public void reverseElementsInArrayList(ArrayList<String> list) {
        Collections.reverse(list);
    }

    public void swapElements(ArrayList<String> list, int index1, int index2) {
        if (index1 < 0 || index1 > list.size() || index2 < 0 || index2 > list.size()) {
            throw new IllegalArgumentException("illegal");
        }
        String temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public boolean isEmptyArrayLists(ArrayList<String> list){
        //return list.isEmpty();
        return list.size() == 0;
    }
    public void increaseSizeArrayList(ArrayList<String> list, int addSize){
        if(addSize<0)
            throw new IllegalArgumentException("illegal");

        list.ensureCapacity(addSize);
    }

}
