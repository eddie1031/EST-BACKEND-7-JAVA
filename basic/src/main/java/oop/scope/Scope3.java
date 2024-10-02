package oop.scope;

public class Scope3 {

    public int a = 10;
    public static int b;

    // 인스턴스 멤버 변수
    public int c = a + b;

    // 클래스 멤버 변수
//    public static int d = a + b; // 문제 발생

    public static void main(String[] args) {

    }

    static void test1() {

    }

}
