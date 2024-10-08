package annotation;

public class AnnotationTests {

    public static void main(String[] args) {
        test1();
    }

    @SuppressWarnings("all")
    private static void test1() {
        LegacyClass legacyClass = new LegacyClass();
        legacyClass.oldMethod();
    }

}
