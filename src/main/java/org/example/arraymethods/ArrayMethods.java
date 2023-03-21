package org.example.arraymethods;

public class ArrayMethods {
    /**
     * This method returns positive elements in array.
     * @param array type int[]
     * @return int[] positivePoints
     * @throws Exception when array.length = 0
     */
    public int[] printPositivePoints(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("in array nothing sorted");
        }
        int count = 0;
        for (int value : array) {
            if (value > 0) {
                count++;
            }
        }
        int[] positivePoints = new int[count];

        int j = 0;
        for (int k : array) {

            if (k > 0) {
                positivePoints[j] = k;
                j++;
            }
        }
        return positivePoints;
    }

    /**
     * this method inversed input array
     *
     * @param array type int[]
     * @return type int array
     * @throws Exception when array.length = 0
     */
    public int[] arrayInverse(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("in array nothing sorted");
        }
        int[] inverse = new int[array.length];

        for (int i = 0, j = array.length - 1; i < inverse.length && j > -1; i++, j--) {
            inverse[i] = array[j];
        }
        return inverse;
    }

    /**
     * this method returns array maximum value
     *
     * @param array type int[]
     * @return type int
     * @throws Exception when array.length = 0
     */
    public int arrayMaxValue(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("in array nothing sorted");
        }

        int maxValue = Integer.MIN_VALUE;

        for (int j : array) {

            if (j > maxValue)
                maxValue = j;
        }
        return maxValue;
    }

    /**
     * this method returns array minimum value
     *
     * @param array type int[]
     * @return type int
     * @throws Exception when array.length = 0
     */
    public int arrayMinValue(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("in array nothing sorted");
        }

        int minValue = Integer.MAX_VALUE;

        for (int j : array) {

            if (j < minValue)
                minValue = j;
        }
        return minValue;
    }

    /**
     * this method returns copy array in new array
     *
     * @param array type int[]
     * @return array - type int[]
     */
    public int[] arrayCopy(int[] array) {

        int[] copyArray = new int[array.length];

        int i = 0;
        while (i < copyArray.length) {
            copyArray[i] = array[i];
            i++;
        }
        return copyArray;
    }

    /**
     * Method adds the corresponding elements of the two arrays and writes them to a third array
     *
     * @param array1 type int[]
     * @param array2 type int[]
     * @return sum two arrays type int[]
     * @throws Exception when array1.length = 0| array2.length = 0
     */
    public int[] sumTwoArrays(int[] array1, int[] array2) throws Exception {
        if (array1.length == 0 || array2.length == 0) {
            throw new Exception("in array nothing");
        }
        if (array1.length != array2.length) {
            throw new Exception("we cant adding this arrays");
        }
        int[] sum = new int[array2.length];

        for (int i = 0; i < sum.length; i++) {
            sum[i] = array1[i] + array2[i];
        }
        return sum;
    }

    /**
     * Method counts the number of times a given number occurs in a given array
     * @param array type int[]
     * @param k type int
     * @return type int
     * @throws Exception when array.length = 0
     */
    public int countK(int[] array, int k) throws Exception {
        if (array.length == 0) {
            throw new Exception("in array nothing");
        }
        int count = 0;

        for (int j : array) {

            if (j == k)
                count++;
        }
        return count;
    }

    /**
     * Method sorts the array elements in descending order
     * @param array type int[]
     * @return array type int[]
     * @throws Exception when array.length = 0
     */
    public int[] sorting(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("in array nothing");
        }
        boolean sort = false;
        while (!sort) {
            sort = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    sort = false;
                    array[i] = array[i] ^ array[i + 1];
                    array[i + 1] = array[i] ^ array[i + 1];
                    array[i] = array[i] ^ array[i + 1];
                }
            }
        }
        return array;
    }

}
