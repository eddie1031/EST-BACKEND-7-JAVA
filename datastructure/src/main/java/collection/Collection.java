package collection;


import collection.stream.Stream;

public interface Collection<E> extends Iterable<E> {

    void add(E e);
    void remove(Object o);
    int size();
    boolean isEmpty();
    boolean contains(Object o);

    Stream<E> stream();

}
