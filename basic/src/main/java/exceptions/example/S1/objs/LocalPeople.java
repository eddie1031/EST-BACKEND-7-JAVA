package exceptions.example.S1.objs;

public class LocalPeople extends People {

    private static String MotherTongue = "Korean";

    public LocalPeople() {
        super(new LanguageType(MotherTongue));
    }

    public LocalPeople(boolean hasTranslator) {
        super(new LanguageType(MotherTongue), hasTranslator);
    }

    @Override
    public void communicate(Communicable other, String message) {
        super.communicate(other, message);
        System.out.println(message);
    }

}
