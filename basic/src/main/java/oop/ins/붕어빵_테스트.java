package oop.ins;

public class 붕어빵_테스트 {

    public static void main(String[] args) {
        test1();
    }

    static void test1() {

        붕어빵 팥붕어빵 = new 붕어빵();

        팥붕어빵.속재료 = "팥";
        팥붕어빵.무슨_붕어빵(); // 팥 붕어빵

        붕어빵 슈크림_붕어빵 = new 붕어빵();

        슈크림_붕어빵.속재료 = "슈크림";
        슈크림_붕어빵.무슨_붕어빵(); // 슈크림 붕어빵

    }

}
