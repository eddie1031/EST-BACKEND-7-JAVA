package generic.example.S1;

import java.util.Objects;

public class Optional<T> {

    private T value;

    private Optional(T value) {
        this.value = value;
    }

    public static <T> Optional<T> empty() {
        return new Optional<>(null);
    }

    public static <T> Optional<T> of(T value) {
        // java Objects
//        T value1 = Objects.requireNonNull(value);
//        Container<T> tContainer = new Container<>(value1);
//        return tContainer;
        return new Optional<>(Objects.requireNonNull(value));
    }

    public static <T> Optional<T> ofNullable(T value) {
        return value == null
                ? new Optional<>(null)
                : new Optional<>(value);
    }

    public T get() {
        if ( value == null ) {
            throw new NoSuchElementException("No value present");
        }
        return value;
    }

    public boolean isPresent() {
        return value != null;
    }

    public boolean isEmpty() {
        return value == null;
    }

}
