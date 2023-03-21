package org.example.arraymethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {
    private ArrayMethods arr = new ArrayMethods();

    @Test
    void printPositivePointsTest() {
        try {
            assertArrayEquals(new int[]{7, 8, 2, 8}, arr.printPositivePoints(new int[]{-8, 7, 8, 2, 0, 8, -3, -9}));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void printPositivePointsTest2() {
        try {
            assertArrayEquals(new int[]{}, arr.printPositivePoints(new int[]{}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void arrayInverseTest() {
        try {
            assertArrayEquals(new int[]{7, 8, 2, 8}, arr.arrayInverse(new int[]{8, 2, 8, 7}));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void arrayInverseTest2() {
        try {
            assertArrayEquals(new int[]{4, 5, 8}, arr.arrayInverse(new int[]{}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    void arrayMaxValueTest() {
        try {
            assertEquals(8, arr.arrayMaxValue(new int[]{8, 2, 5, 7}));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void arrayMaxValueTest2() {
        try {
            assertEquals(8, arr.arrayMaxValue(new int[]{}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void arrayMinValueTest() {
        try {
            assertEquals(2, arr.arrayMinValue(new int[]{8, 2, 5, 7}));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void arrayMinValueTest2() {
        try {
            assertEquals(8, arr.arrayMinValue(new int[]{}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void arrayCopyTest() {
        try {
            assertArrayEquals(new int[]{5, 5, 9, 5}, arr.arrayCopy(new int[]{5, 5, 9, 5}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void sumTwoArraysTest() {
        try {
            assertArrayEquals(new int[]{10, 7, 10, 5}, arr.sumTwoArrays(new int[]{5, 5, 9, 5}, new int[]{5, 2, 1}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void sumTwoArraysTest2() {
        try {
            assertArrayEquals(new int[]{10, 7, 10, 5}, arr.sumTwoArrays(new int[]{5, 5, 9, 5}, new int[]{5, 2, 1, 0}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void sumTwoArraysTest3() {
        try {
            assertArrayEquals(new int[]{10, 7, 10, 5}, arr.sumTwoArrays(new int[]{5, 5, 9, 5}, new int[]{}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void countkTest() {
        try {
            assertEquals(0, arr.countK(new int[]{5, 5, 9, 5, 5}, 7));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    void countkTest2() {
        try {
            assertEquals(4, arr.countK(new int[]{5, 5, 9, 5, 5}, 5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    void countkTest3() {
        try {
            assertEquals(4, arr.countK(new int[]{}, 5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    void sortingTest() {
        try {
            assertArrayEquals(new int[]{12,9,6,5}, arr.sorting(new int[]{9,6,12,5}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    void sortingTest2() {
        try {
            assertArrayEquals(new int[]{12,9,6,5}, arr.sorting(new int[]{}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}