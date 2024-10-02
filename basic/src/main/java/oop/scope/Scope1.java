package oop.scope;

public class Scope1 {

    public static void main(String[] args) {
        test1();
        test2(3);
    }

    static void test1() {
        int x = 10;

        System.out.println("x = " + x);
    }

    static void test2(int y) {
        int x = 10;

        System.out.println(x + y);
    }

    static void test3() {
//        System.out.println(y);
    }


}


