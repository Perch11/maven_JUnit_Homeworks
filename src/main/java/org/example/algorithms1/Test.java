package org.example.algorithms1;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random rand = new Random();
        Algorithms alg = new Algorithms();
        int[] n = new int[10];
        for (int i = 0; i < 10; i++) {
            n[i] = rand.nextInt(100);
        }
            try {
                int[] largeAndSmall = alg.largestAndSmallestNumbersInArray(n);
                for (int i : largeAndSmall) {
                    System.out.print(i + " ");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

    }
}
