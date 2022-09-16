package com.pedrovsn.util.list;

public class Queue<T> {

    private Node<T> first;

    private Node<T> last;

    public void add(T item) {
        Node<T> t = new Node<>(item);
        if(last != null) {
            last.next = t;
        }

        last = t;

        if(first == null) {
            first = last;
        }
    }

    public T remove() {
        if(first == null) {
            throw new IllegalStateException("Queue is empty");
        }
        T data = first.data;
        first = first.next;
        if(first == null) {
            last = null;
        }

        return data;
    }

    public T peek() {
        if(first == null) {
            throw new IllegalStateException("Queue is empty");
        }

        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
