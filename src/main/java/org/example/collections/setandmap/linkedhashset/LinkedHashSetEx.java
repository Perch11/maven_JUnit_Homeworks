package org.example.collections.setandmap.linkedhashset;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

    /**
     * this method removes even elements from set
     * @param set type Integer LinkedHashSet
     * @return type Integer LinkedHashSet
     */
    public LinkedHashSet<Integer> removeEvenNumbers(LinkedHashSet<Integer> set) {
        ArrayList<Integer> temp = new ArrayList<>(set);
        for (Integer n : temp) {
            if (n % 2 == 0) {
                set.remove(n);
            }
        }
        return set;
    }
}



