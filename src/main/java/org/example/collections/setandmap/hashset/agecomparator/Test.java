package org.example.collections.setandmap.hashset.agecomparator;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {

        HashSet<Person> personSet = new HashSet<>();
        personSet.add(new Person("Ani", 18));
        personSet.add(new Person("Lilit", 33));
        personSet.add(new Person("Ando", 20));
        personSet.add(new Person("Rafo", 35));


        ArrayList<Person> sortedPersons = new ArrayList<>(personSet);
        sortedPersons.sort(new AgeComparator());

        for (Person person : sortedPersons) {
            System.out.println(person.getName() + " " + person.getAge());
        }


    }
}
