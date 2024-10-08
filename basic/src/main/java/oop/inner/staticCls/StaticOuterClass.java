package oop.inner.staticCls;

public class StaticOuterClass {

    private final String instanceName = "StaticOuterInstanceName";
    private static final String staticName = "StaticOuterStaticName";

    public final int sharedInstanceValue = 100;
    public static final int sharedStaticValue = 90;

    static class StaticInnerClass {

        private final String innerName = "StaticInnerInstanceName";
        private static final String innerPrivateStaticName = "StaticInnerStaticName";

        public final int innerValue = 100;
        public static final int innerPublicStaticValue = 90;

        public static int a = 10;
        public int b = 20;

        public void test() {

//            System.out.println(instanceName);
            System.out.println(staticName);

            int sharedStaticValue1 = StaticOuterClass.sharedStaticValue;

            StaticOuterClass staticOuterClass = new StaticOuterClass();
            String outerInstanceName = staticOuterClass.instanceName;
            System.out.println("outerInstanceName = " + outerInstanceName);

        }

    }

    public void accessToInnerClass() {

        String innerPrivateStaticName = StaticInnerClass.innerPrivateStaticName;
        int innerPublicStaticValue = StaticInnerClass.innerPublicStaticValue;

        System.out.println("innerPrivateStaticName = " + innerPrivateStaticName);
        System.out.println("innerPublicStaticValue = " + innerPublicStaticValue);

        StaticInnerClass staticInnerClass = new StaticInnerClass();
        String innerName = staticInnerClass.innerName;
        int innerValue = staticInnerClass.innerValue;

        System.out.println("innerValue = " + innerValue);
        System.out.println("innerName = " + innerName);

    }

}
