package oop.inner.instCls;

public class InstOuterClass {

    private final String name = "InstOuterClass";
    protected final String protectedValue = "protectedValue";
    public final int sharedValue = 100;
    String defaultValue = "defaultValue";

    private final String duplicatedName = "duplicatedName1";

    // inner class
    class InnerClass {

        public static final String constValue = "CONST";
        public final int sharedValue = 90;
        private final String duplicatedName = "duplicatedName2";

        public void printOuterMemberVars() {
//            int sharedValue1 = InstOuterClass.this.sharedValue;
            System.out.println("name = " + name);
            System.out.println("protectedValue = " + protectedValue);
            System.out.println("sharedValue = " + InstOuterClass.this.sharedValue);
            System.out.println("defaultValue = " + defaultValue);
        }

        public void printDuplicatedName() {

            String outerVariable = InstOuterClass.this.duplicatedName;
            String innerVariable = this.duplicatedName;

            System.out.println("outerVariable = " + outerVariable);
            System.out.println("innerVariable = " + innerVariable);

        }

    }

    public void printInnerClassVariable() {

        /*
        class InnerClass {
            public static final String constValue = "CONST";
            public final int sharedValue = 90;
            private final String duplicatedName = "duplicatedName2";
          ..
        }
         */
        String constValue = InnerClass.constValue;
        System.out.println("constValue = " + constValue);

        InnerClass innerClass = new InnerClass();
        String innerDuplicateName = innerClass.duplicatedName;
        System.out.println("innerDuplicateName = " + innerDuplicateName);

        int innerSharedValue = innerClass.sharedValue;
        System.out.println("innerSharedValue = " + innerSharedValue);

    }

}
