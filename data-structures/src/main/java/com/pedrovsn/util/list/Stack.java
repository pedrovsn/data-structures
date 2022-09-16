package com.pedrovsn.util.list;

public class Stack<T> {

    private Node<T> top;

    public void push(T item) {
        Node<T> t = new Node<>(item);
        t.next = top;
        top = t;
    }

    public T pop() {
        if(top == null) {
            throw new IllegalStateException("Stack is empty");
        }

        T item = top.data;
        top = top.next;

        return item;
    }

    public T peek() {
        if(top == null) {
            throw new IllegalStateException("Stack is empty");
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
