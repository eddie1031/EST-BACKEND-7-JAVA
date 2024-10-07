package apdx.fnl;

public class FinalKeyword {

    public static void main(String[] args) {

        final int a = 10;
        final int b;
        System.out.println("a = " + a);
//        System.out.println("b = " + b);
        b = 20;
        System.out.println("b = " + b);

        // 변경 불가
//        a = 30;

    }

}
