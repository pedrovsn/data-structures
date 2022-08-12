package com.pedrovsn.algorithms;

public class BinarySearch {
    public int search(int[] array, int element) {
        int left = 0;
        int right = array.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(array[mid] == element) {
                return mid;
            }

            if(array[mid] < element) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
