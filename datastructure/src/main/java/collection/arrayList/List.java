package collection.arrayList;

import collection.Collection;

public interface List<E> extends Collection<E> {

    void add(int index, E element);
    E get(int index);
    E remove(int index);
    E set(int index, E element);

}
