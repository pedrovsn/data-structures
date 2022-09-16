package com.pedrovsn.util.list;

public class MergeSort {

    public void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int midle = left + (right - left) / 2;

        sort(arr, left, midle);
        sort(arr, midle + 1, right);

        merge(arr, left, midle, right);
    }

    public void merge(int arr[], int left, int midle, int right) {
        int[] leftArr = new int[midle - left + 1];
        int[] rightArr = new int[right - midle];

        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int j = 0; j < rightArr.length; j++) {
            rightArr[j] = arr[midle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
