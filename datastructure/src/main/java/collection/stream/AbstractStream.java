package collection.stream;

import collection.Collection;
import collection.arrayList.ArrayList;
import collection.linkedList.LinkedList;
import collection.queue.Queue;
import collection.stack.Stack;

import java.util.Iterator;
import java.util.function.Consumer;

public abstract class AbstractStream<T> implements Stream<T> {

    protected final Collection<T> collection;
    protected abstract Iterator<T> iterator();

    public AbstractStream(Collection<T> collection) {
        this.collection = collection;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterator<T> iterator = iterator();
        while ( iterator.hasNext() ) {
            action.accept(iterator.next());
        }
    }

    protected <R> Collection<R> getCollection() {
        if ( this.collection instanceof LinkedList<?> ) {
            return new LinkedList<>();
        } else if ( this.collection instanceof Stack<?>) {
            return new Stack<>();
        } else if ( this.collection instanceof Queue<?>) {
            return new Queue<>();
        } else {
            return new ArrayList<>();
        }
    }

}
