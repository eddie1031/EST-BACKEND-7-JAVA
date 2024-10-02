package oop.base.ins;

public class InstanceBluePrintTests {

    public static void main(String[] args) {

        test1();
        test2();

    }

    private static void test1() {
        InstanceBluePrint instance = new InstanceBluePrint();

        String insField1 = instance.field1;
        int insField2 = instance.field2;

        System.out.println("insField1 = " + insField1);
        System.out.println("insField2 = " + insField2);

        instance.method1();
        instance.method2();

        instance.field1 = "InjectedValue";
        instance.field2 = 999;

        System.out.println("insField1 = " + insField1);
        System.out.println("insField2 = " + insField2);

        instance.method1();
        instance.method2();
    }

    static void test2() {

        InstanceBluePrint instance1 = new InstanceBluePrint();
        InstanceBluePrint instance2 = new InstanceBluePrint();

        instance1.field1 = "InjectedValue";

        instance2.method2(); // ? ?
        instance1.method2(); // ? ?

    }

}
