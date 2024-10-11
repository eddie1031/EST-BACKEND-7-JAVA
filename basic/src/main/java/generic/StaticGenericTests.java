package generic;

import generic.basic.MyStaticGeneric;

public class StaticGenericTests {

    public static void main(String[] args) {
        test1();
    }

    static void test1() {

        String test1Result = MyStaticGeneric.test1("Hello!");
//        MyStaticGeneric.test1(false);
        MyStaticGeneric.test2(false);
        MyStaticGeneric.test3(1);
        MyStaticGeneric.test3("1");

        System.out.println("test1Result = " + test1Result);

    }

}
