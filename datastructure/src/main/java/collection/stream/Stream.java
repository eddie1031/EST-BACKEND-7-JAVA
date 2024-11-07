package collection.stream;

import collection.arrayList.List;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public interface Stream<T> {

    <R> Stream<R> map(Function<? super T, ? extends R> mapper);
    Stream<T> filter(Predicate<? super T> predicate);
    void forEach(Consumer<? super T> consumer);
    List<T> toList();

}
