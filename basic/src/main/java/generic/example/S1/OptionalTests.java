package generic.example.S1;

public class OptionalTests {

    public static void main(String[] args) {
        test1();
        test2();
    }

    static void test1() {

//        new Container<String>();

        String rawValue = "안녕하세요!";

        Optional<String> helloOptional = Optional.of(rawValue);

        System.out.println(helloOptional.isEmpty());
        System.out.println(helloOptional.isPresent());

        if ( helloOptional.isPresent() ) {
            String findValue = helloOptional.get();
            System.out.println("findValue = " + findValue);

            // Assertion
            // is Equal?
            System.out.println(findValue.equals(rawValue));
        }

    }

    static void test2() {

        try {
            Optional.of(null);
        } catch (NullPointerException e) {
            System.out.println("Null은 올 수 없습니다!");
        }

        Optional<Object> empty = Optional.empty();

        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());

        try {
            empty.get();
        } catch (NoSuchElementException e) {
            System.out.println("값이 아직 들어있지 않습니다!");
            System.out.println(e.getMessage());
        }

    }

}
