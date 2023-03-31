package org.example.collections.setandmap.treeset;

import java.util.TreeSet;

public class TreeSetEx {
    /**
     * this method returns containing only the unique words in the original set, ignoring case
     * @param words String type TreeSet
     * @return String type TreeSet
     */
    public TreeSet<String> getUniqueWords(TreeSet<String> words) {
        TreeSet<String> uniqueWords = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        System.out.println(uniqueWords);
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        return uniqueWords;
    }
}
