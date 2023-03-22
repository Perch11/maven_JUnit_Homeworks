package org.example.algorithms1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {
    private Algorithms alg = new Algorithms();

    @Test
    void largestPrimeFactorTest() {
        assertEquals(13, alg.largestPrimeFactor(455));
    }

    @Test
    void largestPrimeFactorTest2() {
        assertEquals(3, alg.largestPrimeFactor(3));
    }

    @Test
    void evenOrOddTest() {
        assertTrue(alg.evenOrOdd(8));
    }

    @Test
    void evenOrOddTest2() {
        assertFalse(alg.evenOrOdd(11));
    }

    @Test
    void evenOrOddTest3() {
        assertFalse(alg.evenOrOdd(-11));
    }

    @Test
    void largestAndSmallestNumbersInArrayTest() {
        try {
            assertArrayEquals(new int[]{99,1},alg.largestAndSmallestNumbersInArray(new int[]{58,68,99,45,2,1}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    void fooTest(){
        assertTrue(alg.foo(4,3,19));
    }
    @Test
    void fooTest1(){
        assertFalse(alg.foo(3,3,14));
    }
    @Test
    void fooTest2(){
        assertFalse(alg.foo(3,-3,14));
    }


}