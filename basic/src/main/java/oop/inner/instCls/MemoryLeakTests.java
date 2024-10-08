package oop.inner.instCls;

public class MemoryLeakTests {

    private String name = "InstanceInnerClassOuter";

    class InnerClass {
        void printName() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {

        MemoryLeakTests memoryLeakTests = new MemoryLeakTests();
        InnerClass innerClass = memoryLeakTests.new InnerClass();
//        innerClass.printName();

        memoryLeakTests = null;
        innerClass.printName();

    }

}
