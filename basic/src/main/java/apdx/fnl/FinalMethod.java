package apdx.fnl;

public class FinalMethod {

    final void method1() {
        System.out.println("FinalMethod.method1");
    }

    public void method2(int a, int b) {

        int result = a + b;

        System.out.println("result = " + result);

        a = result;
        System.out.println("a = " + a);

    }

    public void method3(final int a, int b) {

        int result = a + b;

        System.out.println("result = " + result);

//        a = result;
        System.out.println("a = " + a);

    }



}
