package exceptions;

public class ExceptionTests {

    public static void main(String[] args) {
//        test1(); // 문제없이 실행 가능

        try {
//            test1();
            test2();
        } catch ( RuntimeException e) {
            System.out.println("Runtime!");
        } catch ( Exception e ) {
            System.out.println("Exception!");
        } finally {
            System.out.println("저는 무조건 실행 됩니다!");
        }

        System.out.println("바깥!");

    }

    static void test1() {
         active1();
         active2();
    }

    static void test2() throws Exception {
         active3();
         active4();
    }

    static void active1() {
        throw new RuntimeException("Unchecked Exception!");
    }

    static void active2() throws RuntimeException {
//        RuntimeException runtimeException = new RuntimeException();
//        System.out.println("runtimeException = " + runtimeException);
        throw new RuntimeException("Unchecked Exception!");
    }

    static void active3() {
//        throw new Exception();
    }

    static void active4() throws Exception {
        throw new Exception("Checked Exception!");
    }

}
