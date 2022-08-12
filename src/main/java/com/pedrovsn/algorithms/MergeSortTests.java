package com.pedrovsn.algorithms;

import java.util.Arrays;

public class MergeSortTests {

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();

        int[] arr = new int[] {1, 4, 2, 9, 6, 5};
        mergeSort.sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
