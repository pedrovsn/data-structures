package com.pedrovsn.util.list;

import java.util.Arrays;

public class ArrayList<T> {

    private Object[] array = new Object[100];
    private int nextIndex;

    public <T> void add(T obj) {
        guaranteeSpace();

        this.array[nextIndex] = obj;
        nextIndex++;
    }

    public <T> void add(T obj, int position) {
        guaranteeSpace();

        for(int i = nextIndex; i > position; i--) {
            // each element to the right
            this.array[i] = this.array[i + 1];
        }
        this.array[position] = obj;
    }

    public void remove(int position) {
        // all elements one step to the left
        for(int i = position; i < this.nextIndex - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.nextIndex--;

        // free space on the last position
        this.array[this.nextIndex] = null;
    }

    public T get(int position) {
        if(!occuped(position)) {
            throw new RuntimeException("Element does not exist");
        }

        return (T) this.array[position];
    }

    public int size() {
        return this.nextIndex;
    }

    public boolean isEmpty() {
        return this.nextIndex == 0;
    }

    @Override
    public String toString() {
        return "ArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    private boolean isFull() {
        return this.nextIndex == this.array.length;
    }

    private void guaranteeSpace() {
        if(isFull()) {
            Object[] tempArray = new Object[this.array.length * 2];

            for(int i = 0; i < this.nextIndex; i++) {
                tempArray[i] = this.array[i];
            }

            this.array = tempArray;
        }
    }

    private boolean occuped(int position) {
        return position >= 0 && position < this.nextIndex;
    }
}
