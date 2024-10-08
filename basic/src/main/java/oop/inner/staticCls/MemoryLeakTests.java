package oop.inner.staticCls;

public class MemoryLeakTests {

    static class StaticInnerClass {
        void display() {
            System.out.println("StaticInnerClass.display");
        }
    }

    public static void main(String[] args) {

        MemoryLeakTests.StaticInnerClass cls = new MemoryLeakTests.StaticInnerClass();
        cls.display();

        cls = null;
        cls.display();

    }

}
