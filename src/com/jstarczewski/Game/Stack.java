package com.jstarczewski.Game;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {

    private Item[] items = (Item[]) new Object[1];
    private int length = 0;

    public Item popWithoutPoping() {
        if (items[length]!=null)
            return items[length-1];
        return null;
    }

    public void push(Item item) {
        if (length == items.length)
            resize(items.length * 2);
        items[length++] = item;
    }

    public Item pop() {
            Item item = items[--length];
            items[length] = null;
            if (length > 0 && length == (items.length / 4))
                resize(items.length / 2);
            return item;
    }

    private void resize(int max) {
        Item[] temps = (Item[]) new Object[max];
        for (int i = 0; i < length; i++)
            temps[i] = items[i];
        items = temps;
    }


    @Override
    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Item> {

        private int i = 0;

        @Override
        public boolean hasNext() {
            return i < length;
        }

        @Override
        public Item next() {
            return items[i++];
        }

        @Override
        public void remove() {

        }
    }

    @Override
    public String toString() {
        String base = " ";
        for (int i = 0; i < length; i++) {
            base += " " + items[i].toString();
        }
        return base;
    }

    public boolean isEmpty() {
        return items.length<=0;
    }

}
