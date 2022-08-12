package com.pedrovsn.algorithms;

import java.util.Arrays;

class LFUCache {
    private CacheItem[] items;
    private int index;

    public LFUCache(int capacity) {
        this.items = new CacheItem[capacity];
    }

    public int get(int key) {
        int keyIndex = -1;
        for(int i = 0; i < this.index - 1; i++) {
            if(this.items[i].key == key) {
                keyIndex = i;
            }
        }

        // [1, 2, 3, 4, 5]
        // [1, , 3, 4, 5] -> keyIndex = 1

        if(keyIndex >= 0) {
            CacheItem item = items[keyIndex];
            for(int i = keyIndex; i < items.length - 1; i++) {
                this.items[i] = this.items[i + 1];
            }
            this.items[this.items.length - 1] = item;
            return item.value;
        }

        return -1;
    }

    public void put(int key, int value) {
        if(this.index + 1 > this.items.length) {
            removeLeastUsed();
        }

        this.items[index] = new CacheItem(key, value);
        this.index++;
    }

    private void removeLeastUsed() {
        for(int i = 0; i < this.items.length - 1; i++) {
            this.items[i] = this.items[i + 1];
        }
        this.items[this.items.length - 1] = null;
        this.index--;
    }

    private static class CacheItem {
        private final int key;
        private final int value;

        private CacheItem(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "CacheItem{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
}