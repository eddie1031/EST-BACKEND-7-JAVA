package generic.basic;

public class MyStaticGeneric<T> {

    public static <T> String test1(T data) {
        System.out.println("data = " + data);
        return "Hello World!";
    }

    public static <T> void test2(T data) {
        System.out.println("data = " + data);
    }

    public static <T> T test3(T data) {
        System.out.println("data = " + data);
        return data;
    }

}
