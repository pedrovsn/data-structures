package com.pedrovsn.util.list;

public class QueueTests {

    public static void main(String[] args) {
        Queue<String> stringQueue = new Queue<>();
        System.out.println(stringQueue.isEmpty());

        stringQueue.add("Pedro");
        System.out.println("Pedro".equals(stringQueue.peek()));

        stringQueue.add("Nicole");
        System.out.println("Pedro".equals(stringQueue.peek()));

        System.out.println("Pedro".equals(stringQueue.remove()));
        System.out.println("Nicole".equals(stringQueue.peek()));
        System.out.println("Nicole".equals(stringQueue.remove()));
        System.out.println(stringQueue.isEmpty());
    }
}
