package com.pedrovsn.algorithms;

import com.pedrovsn.algorithms.ArrayList;

public class ArrayListTests {

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        System.out.println("Size is zero: " + (stringArrayList.size() == 0));
        System.out.println("ArrayList is empty: " + stringArrayList.isEmpty());

        stringArrayList.add("Book");
        System.out.println(stringArrayList);

        stringArrayList.add("Table");
        System.out.println(stringArrayList);

        stringArrayList.add("Computer");
        System.out.println(stringArrayList);

        // Remove "table"
        stringArrayList.remove(1);
        System.out.println(stringArrayList);
    }
}
