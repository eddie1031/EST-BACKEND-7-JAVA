package oop.base.scope;

public class Scope2 {

    public int a = 10;
    public static int b = 20;

    public static void main(String[] args) {

    }

    static void test1() {
        System.out.println(b);
    }

    void instanceMethod1() {
        // a ? -> o
        System.out.println(a);
        // b ? -> o
        System.out.println(b);
    }

}
