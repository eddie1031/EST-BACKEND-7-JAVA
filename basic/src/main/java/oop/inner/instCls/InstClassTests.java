package oop.inner.instCls;

public class InstClassTests {

    public static void main(String[] args) {

        InstOuterClass instOuterClass = new InstOuterClass();
        instOuterClass.printInnerClassVariable();

        System.out.println();

        InstOuterClass.InnerClass innerClass = instOuterClass.new InnerClass();
        innerClass.printOuterMemberVars();

        InstOuterClass.InnerClass innerClass1 = new InstOuterClass().new InnerClass();

    }

}
