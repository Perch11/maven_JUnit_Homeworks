package org.example.collections.setandmap.linkedhashset.agecomparator;


import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    /**
     * Age comparator method
     * @param p1 the first object to be compared.
     * @param p2 the second object to be compared.
     * @return int type
     */
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }



}
