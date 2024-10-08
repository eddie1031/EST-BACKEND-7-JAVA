package oop.inner.staticCls;

public class StaticOuterClassTests {

    public static void main(String[] args) {
        test1();
    }

    // 인스턴스 생성 테스트
    static void test1() {

//        StaticOuterClass staticOuterClass = new StaticOuterClass();
//        staticOuterClass.accessToInnerClass();

        StaticOuterClass.StaticInnerClass staticInnerClass1 = new StaticOuterClass.StaticInnerClass();
        StaticOuterClass.StaticInnerClass staticInnerClass2 = new StaticOuterClass.StaticInnerClass();

        int innerValue1 = staticInnerClass1.b;
        System.out.println("innerValue1 = " + innerValue1);
        staticInnerClass1.b = 1000;
        System.out.println("staticInnerClass1.b = " + staticInnerClass1.b);
        int innerValue2 = staticInnerClass2.b;
        System.out.println("innerValue2 = " + innerValue2);
        staticInnerClass2.b = 2000;
        System.out.println("staticInnerClass2.b = " + staticInnerClass2.b);

        System.out.println("========");

        System.out.println("staticInnerClass1.b = " + staticInnerClass1.b);
        System.out.println("staticInnerClass2.b = " + staticInnerClass2.b);

        staticInnerClass2.a = 3000;
        staticInnerClass2.b = 4000;

        System.out.println("========");

        System.out.println("staticInnerClass1.a = " + staticInnerClass1.a);
        System.out.println("staticInnerClass2.a = " + staticInnerClass2.a);



    }

}
