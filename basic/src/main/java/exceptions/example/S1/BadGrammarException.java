package exceptions.example.S1;

public class BadGrammarException extends RuntimeException {
    public BadGrammarException() {
        super();
    }

    public BadGrammarException(String message) {
        super(message);
    }

    public BadGrammarException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadGrammarException(Throwable cause) {
        super(cause);
    }
}
