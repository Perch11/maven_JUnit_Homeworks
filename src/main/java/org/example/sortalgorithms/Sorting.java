package org.example.sortalgorithms;

public class Sorting {

    /**
     * "bubble sort" sorting method
     * @param array type int[]
     * @return type int[]
     * @throws Exception when array.length = 0
     */
    public int[] bubbleSort(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("in array nothing sorted");
        }
        for (int i = 0; i < array.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
        System.out.println("okey");
        return array;
    }


    /**
     * "Selection sort" sorting method
     * @param array type int[]
     * @return tyoe int[]
     * @throws Exception when array.length = 0
     *
     */
    public int[] selectionSort(int[] array) throws Exception{
        if (array.length == 0) {
            throw new Exception("in array nothing sorted");
        }
        int index;
        int temp;
        for (int i = 0; i <array.length - 1 ; i++) {
            index = i;
            for (int j = i+1; j <array.length ; j++) {
                if(array[j]< array[index]){
                    index = j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;

        }
        return array;

    }

    /**
     * "insertion sort" sorting method
     * @param array type int[]
     * @return type int[]
     * @throws Exception when array.length = 0
     */
    public int[] insertionSort(int[] array) throws Exception{
        if (array.length == 0) {
            throw new Exception("in array nothing sorted");
        }

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }

    public int[] mergeSort(int[] arr, int left, int right){
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
        return arr;
    }

    public void merge(int[] arr, int left, int mid, int right){


        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


}
