package generic;

import generic.basic.MyGeneric;

public class GenericTests {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    static void test1() {

        System.out.println("GenericTests.test1");

//        MyGeneric<Object, Object, Object> a = new MyGeneric<>();
        MyGeneric<String, String, String> generic = new MyGeneric<String, String, String>();

        generic.setKey("key");
//        generic.setKey(false); // String으로 확정되어있기 때문에 다른 자료형을 할당할 수 없음

        generic.setType("type");

        generic.setValue("value");
//        generic.setValue(1); // String으로 확정되어있기 때문에 다른 자료형을 할당할 수 없음

        System.out.println(generic.toString());
    }

    static void test2() {

        System.out.println("GenericTests.test2");

        MyGeneric<String, Integer, Boolean> generic = new MyGeneric<>();

        generic.setKey("Key");
//        generic.setKey(1);
        generic.setValue(1);
        generic.setType(false);

        System.out.println(generic.toString());

    }

    static void test3() {

        System.out.println("GenericTests.test3");

        // MyGeneric<K, V, T>

        MyGeneric<String, String, Boolean> generic1 = new MyGeneric<>();

        generic1.setKey("Key");
        generic1.setValue("Value");
        generic1.setType(false);

        MyGeneric<String, Boolean, String> generic2 = new MyGeneric<>();

        generic2.setKey("Key");
        generic2.setValue(false);
        generic2.setType("Type");

//        generic1.setValue(false);

        System.out.println(generic1.toString());
        System.out.println(generic2.toString());


    }

}
