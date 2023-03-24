package org.example.collections.arraylistmethods;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();

//1
        ArrayList<String> list = new ArrayList<String>();
        list.add("mane");
        list.add("edo");
        list.add("mane");
        list.add("suro");
        myList.iterateElementsInArrayList(list);
        System.out.println();

//2
        myList.insertInArrayList(list);
        System.out.println(list);
        System.out.println();

//3
        myList.updateInArrayList(list);
        myList.iterateElementsInArrayList(list);
        System.out.println();

//4
        myList.searchElementInArrayList(list,"suro");
        System.out.println();

//5
        ArrayList<String> list1 = new ArrayList<String>(list);
        System.out.println(list1);
        System.out.println();

//6
        myList.reverseElementsInArrayList(list);
        System.out.println(list);

//7
        myList.swapElements(list,2,3);
        System.out.println(list);
        System.out.println();

//8
        ArrayList<String> list2 = new ArrayList<String>();
        System.out.println(myList.isEmptyArrayLists(list));
        System.out.println(myList.isEmptyArrayLists(list2));
        System.out.println();

//9
        ArrayList<String> list3 = new ArrayList<String>(3);
        myList.increaseSizeArrayList(list2,6);
        System.out.println();
    }
}
