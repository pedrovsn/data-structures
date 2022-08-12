package com.pedrovsn.algorithms;

import java.util.Arrays;

public class QuickSortTests {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        int[] arr = new int[] {1, 4, 2, 9, 6, 5};
        quickSort.quickSort(arr, 0, 5);

        System.out.println(Arrays.toString(arr));
    }
}
