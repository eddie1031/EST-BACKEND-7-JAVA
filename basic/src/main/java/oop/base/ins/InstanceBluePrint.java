package oop.base.ins;

public class InstanceBluePrint {

    public String field1 = "field1";
    public int field2 = 1;

    public void method1() {
        System.out.println("InstanceBluePrint.method1");
    }

    public void method2() {
        System.out.println("field1 = " + field1);
        System.out.println("field2 = " + field2);
    }

}
