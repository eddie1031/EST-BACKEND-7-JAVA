package oop.base.scope;

public class Scope5 {

    public int a = 10;
    public static int b = 20;

    public int c = a + b;
    public static int d = 20;

    public static int e = b + d;

    public String f = "전역변수";

    public static void main(String[] args) {

    }

    void test1() {
        System.out.println("f = " + f);

        String f = "지역변수!";

        System.out.println("f = " + f);
        System.out.println("f = " + this.f);
    }


}
