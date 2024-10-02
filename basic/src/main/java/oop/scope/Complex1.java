package oop.scope;

public class Complex1 {

    public int a = 10;

    public void method1() {

        if ( true ) {
            System.out.println("a = " + a);

            int b = 20;

            System.out.println("b = " + b);
        }

//        System.out.println(b);
//        System.out.println(a);

    }


}
