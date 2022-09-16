package com.pedrovsn.util.list;

public class StackTests {

    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        System.out.println(stringStack.isEmpty());

        stringStack.push("Pedro");
        System.out.println(stringStack.isEmpty());
        System.out.println("Pedro".equals(stringStack.peek()));

        stringStack.pop();
        System.out.println(stringStack.isEmpty());
    }
}
