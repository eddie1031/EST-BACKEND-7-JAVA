package exceptions.example.S1;

public class AmbiguousVocaException extends RuntimeException {

    public AmbiguousVocaException() {
        super();
    }

    public AmbiguousVocaException(String message) {
        super(message);
    }

    public AmbiguousVocaException(String message, Throwable cause) {
        super(message, cause);
    }

    public AmbiguousVocaException(Throwable cause) {
        super(cause);
    }

}
