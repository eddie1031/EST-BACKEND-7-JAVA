package collection.stream;

import collection.Collection;
import collection.arrayList.ArrayList;
import collection.arrayList.List;

import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

public class ListStream<T> extends AbstractStream<T> {

    public ListStream(Collection<T> collection) {
        super(collection);
    }

    @Override
    protected Iterator<T> iterator() {
        return this.collection.iterator();
    }

    @Override
    public <R> Stream<R> map(Function<? super T, ? extends R> mapper) {

        Collection<R> result = getCollection();

        forEach(el -> result.add(mapper.apply(el)));

        return new ListStream<>(result);
    }

    @Override
    public Stream<T> filter(Predicate<? super T> predicate) {

        Iterator<T> iterator = iterator();
        Collection<T> result = getCollection();

        while ( iterator.hasNext() ) {
            T item = iterator.next();
            if ( predicate.test(item) ) {
                result.add(item);
            }
        }

        return new ListStream<>(result);
    }

    @Override
    public List<T> toList() {
        List<T> list = new ArrayList<>();

        Iterator<T> iterator = iterator();

        while( iterator.hasNext() ) {
            T item = iterator.next();
            list.add(item);
        }

        return list;
    }

}
