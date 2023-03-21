package org.example.sortalgorithms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {
    private Sorting s;

    @BeforeEach
    void setup() {
        s = new Sorting();
    }

    @AfterEach
    void clean() {
        s = null;
    }

    @Test
    void bubbleSortTest() {
        try {
            assertArrayEquals(new int[]{}, s.bubbleSort(new int[]{}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            assertArrayEquals(new int[]{-9, 0, 3, 4, 5, 7, 9}, s.bubbleSort(new int[]{7, 5, 4, -9, 9, 3, 0}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void selectionSortTest() {
        try {
            assertArrayEquals(new int[]{}, s.selectionSort(new int[]{}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            assertArrayEquals(new int[]{-9, 0, 3, 4, 5, 7, 9}, s.selectionSort(new int[]{7, 5, 4, -9, 9, 3, 0}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void insertionSortTest() {
        try {
            assertArrayEquals(new int[]{}, s.insertionSort(new int[]{}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            assertArrayEquals(new int[]{-9, 0, 3, 4, 5, 7, 9}, s.insertionSort(new int[]{7, 5, 4, -9, 9, 3, 0}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}