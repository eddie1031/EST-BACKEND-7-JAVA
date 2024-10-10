package exceptions.example.S1.objs;

public class ForeignPeople extends People {

    private static String MotherTongue = "English";

    public ForeignPeople() {
        super(new LanguageType(MotherTongue));
    }

    public ForeignPeople(boolean hasTranslator) {
        super(new LanguageType(MotherTongue), hasTranslator);
    }

    @Override
    public void communicate(Communicable other, String message) {
        super.communicate(other, message);
        System.out.println(message);
    }
}
