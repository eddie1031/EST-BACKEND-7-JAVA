package oop.scope;

public class Scope4 {

    public int a = 10;
    public static int b = 20;

    public int c = a + b;
    public static int d = 20;

    public static int e = b + d;

    public static void main(String[] args) {

    }

    static void test1() {
        System.out.println(b);
    }

    void test2() {
        System.out.println(a);
        System.out.println(e);
    }

}
