package org.example.collections.setandmap.hashset;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        var ex = new HashsetEx();
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(12);
        set1.add(5);
        set1.add(1);
        set1.add(6);
        set1.add(4);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(8);
        set2.add(5);
        set2.add(1);
        set2.add(12);
        set2.add(4);
        ex.commonElement(set1,set2);

        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("apple");
        originalSet.add("banana");
        originalSet.add("orange");
        originalSet.add("Banana");
        originalSet.add("peach");
        originalSet.add("Apple");
        originalSet.add("Peach");
        originalSet.add("pear");
        ex.print(originalSet);
        System.out.println();
        HashSet<String> uniqueSet = ex.uniqueWords(originalSet);
        ex.print(uniqueSet);

    }
}
