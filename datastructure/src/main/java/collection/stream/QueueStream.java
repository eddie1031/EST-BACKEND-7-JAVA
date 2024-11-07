package collection.stream;

import collection.Collection;

public class QueueStream<T> extends ListStream<T> {
    public QueueStream(Collection<T> collection) {
        super(collection);
    }
}
