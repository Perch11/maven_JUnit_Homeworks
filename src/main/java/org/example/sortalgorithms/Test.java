package org.example.sortalgorithms;

public class Test {
    public static void main(String[] args) {
        Sorting s = new Sorting();
        try {
            int[] sorted = s.insertionSort(new int[]{8, 5, 6, 9, -8, 7, 0, 13, 32});
            for (int i = 0; i < sorted.length; i++) {
                System.out.print(sorted[i] + " ");
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
}
