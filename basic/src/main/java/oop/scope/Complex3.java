package oop.scope;

public class Complex3 {

    static int i = -5;

    public static void main(String[] args) {
        test1();

    }

    static void test1() {

        int i = 0;

        for ( ; i < 10; i++ ) {
            System.out.println("i = " + i);
        }

    }


}
