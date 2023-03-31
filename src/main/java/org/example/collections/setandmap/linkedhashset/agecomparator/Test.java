package org.example.collections.setandmap.linkedhashset.agecomparator;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        LinkedHashSet<Person> set = new LinkedHashSet<>();
        set.add(new Person("Arman", 45));
        set.add(new Person("Vzgo", 32));
        set.add(new Person("Tiko", 30));
        set.add(new Person("Armen", 18));
        set.add(new Person("Nare", 26));
        System.out.println("Original set ->" + set);

        ArrayList<Person> sorted = new ArrayList<>(set);
        sorted.sort(new AgeComparator());

        System.out.println("Sorted of increasing age:");
        for (Person person : sorted) {

            System.out.println(person);
        }
    }
}
