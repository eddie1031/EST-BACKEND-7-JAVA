package methods;

public class Method1 {

    public static void main(String[] args) {

//        int intResult = aInt + bInt;
//        System.out.println("intResult = " + intResult);
//
//        double doubleResult = aInt + bInt;
//        System.out.println("doubleResult = " + doubleResult);

        printTest(); // public
        printTest2(); // default(Package)
        printTest3(); // private

//        printTest();
        Method2.printTest(); // (static) 메서드가 있는 클래스이름.메서드이름();

    }

    public static void printTest() {
        System.out.println("public");
    }

    static void printTest2() { // default
        System.out.println("default(Package)");
    }

    private static void printTest3() {
        System.out.println("private");
    }

    public static void printTest4() {
        System.out.println("public");

        printTest2();
        printTest3();
        Method2.printTest();

    }

}
