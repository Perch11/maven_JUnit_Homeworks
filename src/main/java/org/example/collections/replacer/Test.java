package org.example.collections.replacer;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Replace<String> replace = new Replace<>();
        ArrayList<String> list = new ArrayList<>();
        list.add("ani");
        list.add("rub");
        list.add("ani");
        list.add("arsen");
        list.add(null);
        list.add("ani");

        replace.replace(list,null,"hasmik");
        replace.replaceItem(list,"ani","lilit");
        System.out.println(list);

        list.clear();
    }
}
