package collection.stack;

import collection.Collection;
import collection.stream.StackStream;
import collection.stream.Stream;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<E> implements Collection<E> {

    // Stack
    // https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Stack.html

    // Vector
    // https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Vector.html

    private Object[] elements = {};

    public void push(E e) {

        Object[] tmp = new Object[elements.length + 1];

        for ( int i = 0; i < elements.length; i++ ) {
            tmp[i] = elements[i];
        }

        tmp[elements.length] = e;

        elements = tmp;

    }

    @SuppressWarnings("unchecked")
    public E pop() {

        Object[] tmp = new Object[elements.length - 1];
        E target = (E) elements[elements.length - 1];

        for ( int i = 0; i < elements.length - 1; i++ ) {
            tmp[i] = elements[i];
        }

        elements = tmp;

        return target;

    }

    @SuppressWarnings("unchecked")
    public E top() {
        return (E) elements[elements.length - 1];
    }

    @Override
    public void add(E e) {
        push(e);
    }

    @Override
    public void remove(Object o) {
        if ( top().equals(o)) {
            pop();
        }
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        return elements.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for ( int i = 0; i < elements.length; i++ ) {
            if ( elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for ( Object element : elements ) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Stream<E> stream() {
        return new StackStream<>(this);
    }

    private class StackIterator implements Iterator<E> {

        private int curIdx = elements.length - 1;

        @Override
        public boolean hasNext() {
            return curIdx >= 0;
        }

        @Override
        @SuppressWarnings("unchecked")
        public E next() {
            if ( !hasNext() ) {
                throw new NoSuchElementException();
            }
            return (E) elements[curIdx--];
        }

    }

}
