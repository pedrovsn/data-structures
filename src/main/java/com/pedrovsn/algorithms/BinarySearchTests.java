package com.pedrovsn.algorithms;

public class BinarySearchTests {

    public static void main(String[] args) {
        final var array = new int[]{1, 2, 3, 4, 5, 6, 7};

        BinarySearch binarySearch = new BinarySearch();

        int search = binarySearch.search(array, 7);
        System.out.println("Position: " + search);

        search = binarySearch.search(array, 4);
        System.out.println("Position: " + search);

        search = binarySearch.search(array, 1);
        System.out.println("Position: " + search);

        search = binarySearch.search(array, 3);
        System.out.println("Position: " + search);

        search = binarySearch.search(array, 6);
        System.out.println("Position: " + search);

        search = binarySearch.search(array, 5);
        System.out.println("Position: " + search);

        search = binarySearch.search(array, 2);
        System.out.println("Position: " + search);
    }
}
