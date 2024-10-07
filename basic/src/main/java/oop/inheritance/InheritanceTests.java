package oop.inheritance;

public class InheritanceTests {

    public static void main(String[] args) {
//        test1();
//        test2();
    }

    // 하위 클래스에서 상위 클래스 메서드 호출 테스트
    // 상위 클래스에 있는 멤버 변수값을 사용
    static void test1() {
        SubClass subClass = new SubClass();

        subClass.getUniqueName();
        subClass.introduce();
    }

    static void test2() {
        SubClass subClass = new SubClass("SubClass", "Child");

        subClass.getUniqueName();
        subClass.introduce();

    }

}
