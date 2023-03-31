package org.example.collections.setandmap.treeset;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSetEx ex = new TreeSetEx();
        TreeSet<String> set = new TreeSet<>();
        set.add("Ayo");
        set.add("Hello");
        set.add("Hi");
        set.add("hi");
        set.add("ayo");
        set.add("world");
        System.out.println(set);
        set = ex.getUniqueWords(set);
        System.out.println(set);
    }
}
