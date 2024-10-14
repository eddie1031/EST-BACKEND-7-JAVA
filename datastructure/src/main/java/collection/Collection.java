package collection;

public interface Collection<E> {

    void add(E e); // Create
    void remove(Object o);
    int size();
    boolean isEmpty();
    boolean contains(Object o);

}
