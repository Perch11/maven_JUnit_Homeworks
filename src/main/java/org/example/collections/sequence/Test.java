package org.example.collections.sequence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> sequence = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            int number = Integer.parseInt(line);
            if (number > 0) {
                sequence.add(number);
            }
            if (number <= 0) {
                sequence.add(number);
            }
        }

        MyIntegerArrayList myIntegerArrayList = new MyIntegerArrayList();
//17
        int sum = myIntegerArrayList.sum(sequence);
        System.out.println("sum integers = " + sum);

        double average = myIntegerArrayList.average(sum,sequence);
        System.out.println("average = " + average);

//18
        System.out.println(sequence);
        Collections.sort(sequence);
        System.out.println(sequence);
//19

        myIntegerArrayList.removeAllNegatives(sequence);
        System.out.println(sequence);
//20


    }
}
