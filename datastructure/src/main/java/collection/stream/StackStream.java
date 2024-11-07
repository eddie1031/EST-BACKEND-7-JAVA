package collection.stream;

import collection.Collection;

public class StackStream<T> extends ListStream<T> {
    public StackStream(Collection<T> collection) {
        super(collection);
    }
}
