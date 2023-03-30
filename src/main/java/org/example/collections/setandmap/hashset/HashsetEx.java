package org.example.collections.setandmap.hashset;

import java.util.HashSet;

public class HashsetEx<T> {
    /**
     * this method finds common elements in two hashsets
     * @param set1 type hashset<T> list
     * @param set2 type hashset<T> list
     */
    public void commonElement(HashSet<T> set1, HashSet<T> set2) {
        HashSet<T> commonEl = new HashSet<>(set1);
        commonEl.retainAll(set2);
        System.out.println(commonEl);
    }

    /**
     * this method returns containing only the unique words in the original set, ignoring case
     * @param set type HashSet
     * @return type HashSet<T>
     */
    public HashSet<String> uniqueWords(HashSet<String> set){
        HashSet<String> uniqueSet = new HashSet<>();
        for (String word : set) {
            if (!uniqueSet.contains(word.toLowerCase())) {
                uniqueSet.add(word.toLowerCase());
            }
        }
        return uniqueSet;
    }

    /**
     * this method prints set
     * @param set type HashSet<T>
     */
    public void print(HashSet<T> set) {
        for (T t : set) {
            System.out.print(t + " ");
        }
    }

}
