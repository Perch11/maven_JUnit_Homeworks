package org.example.collections.setandmap.linkedhashset;

import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        LinkedHashSetEx linkedHashSetEx = new LinkedHashSetEx();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        System.out.println("Original set: " + set);

        set = linkedHashSetEx.removeEvenNumbers(set);

        System.out.println("updated set: " + set);
    }
}
