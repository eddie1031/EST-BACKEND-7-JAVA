package exceptions.example.S1.objs;

public interface Communicable {

    void communicate(Communicable other, String message);
    LanguageType getLanguaeType();
    boolean hasTranslator();

}
