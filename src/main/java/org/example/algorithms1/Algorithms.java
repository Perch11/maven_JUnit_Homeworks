package org.example.algorithms1;

public class Algorithms {
    /**
     * A method calculates the largest prime factor of a given number.
     *
     * @param n int type
     * @return int type
     */
    public int largestPrimeFactor(int n) {
        if (n <= 3) {
            return n;
        }
        int largestFactor = 1;
        while (n % 2 == 0) {
            largestFactor = 2;
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largestFactor = i;
                n /= i;
            }
        }
        if (n > 2) {
            largestFactor = n;
        }
        return largestFactor;
    }

    /**
     * if return type is true number is even
     * if return type is false number is odd
     *
     * @param n int type
     * @return boolean type
     * @throws IllegalArgumentException when input parameter < 0
     */
    public boolean evenOrOdd(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Illegal Argument");
        }
        return n % 2 == 0;

    }

    /**
     * this method returns largest and smallest numbers in array
     *
     * @param array int[] type
     * @return int[] type
     * @throws Exception when array.length = 0
     */
    public int[] largestAndSmallestNumbersInArray(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("in array no arguments");
        }

        int[] smallAndLarge = {array[0], array[0]};

        for (int i = 1; i < array.length; i++) {

            while (array[i] > smallAndLarge[0]) {
                smallAndLarge[0] = array[i];
            }
            while (array[i] < smallAndLarge[1]) {
                smallAndLarge[1] = array[i];
            }
        }
        return smallAndLarge;
    }

    /**
     * Provided that you have a given number of small rice bags (1 kilo each)
     * and big rice bags (5 kilos each), write a method that returns true if it is
     * possible to make a package with goal kilos of rice
     *
     * @param n type int
     * @param t type int
     * @param r type int
     * @return type boolean
     */
    public boolean foo(int n, int t, int r) throws IllegalArgumentException {
        if (n < 0 || t < 0 || r < 0) {
            throw new IllegalArgumentException("Illegal Argument dear");
        }
        return (n + t * 5 >= r) && (r % 5 <= n);
    }
}
