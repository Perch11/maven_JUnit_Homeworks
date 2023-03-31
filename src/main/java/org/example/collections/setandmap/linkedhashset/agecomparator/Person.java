package org.example.collections.setandmap.linkedhashset.agecomparator;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public LinkedHashSet<Person> removeDuplicates(LinkedHashSet<Person> set) {

        return set;
    }

}
