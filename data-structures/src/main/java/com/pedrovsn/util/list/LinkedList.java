package com.pedrovsn.util.list;

public class LinkedList<T> {

    private int index;

    private Node<T> first;

    private Node<T> last;

    public void add(T obj) {
        if(this.index == 0) {
            Node<T> tNode = new Node<>(obj, null, null);
            this.first = tNode;
            this.last = tNode;
        } else {
            Node<T> tNode = new Node<>(obj, null, this.last);
            this.last.previous = tNode;
        }

        this.index++;
    }

    private static class Node<E> {
        E item;

        Node<E> next;

        Node<E> previous;

        public Node(E item, Node<E> next, Node<E> previous) {
            this.item = item;
            this.next = next;
            this.previous = previous;
        }
    }
}
