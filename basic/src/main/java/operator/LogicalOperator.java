package operator;

public class LogicalOperator {

    public static void main(String[] args) {

        boolean iAmTrue = true;
        boolean iAmFalse = false;

        // # 관계 연산자

        // ## 논리 AND 연산자, &&
        boolean andResult1 = iAmTrue && iAmFalse;
        boolean andResult2 = iAmTrue && iAmTrue;
        boolean andResult3 = iAmFalse && iAmTrue;

        System.out.println("andResult1 = " + andResult1); // false
        System.out.println("andResult2 = " + andResult2); // true
        System.out.println("andResult3 = " + andResult3); // false

        System.out.println();

        // ## 논리 OR 연산자, ||
        boolean orResult1 = iAmTrue || iAmFalse;
        boolean orResult2 = iAmFalse || iAmTrue;
        boolean orResult3 = iAmFalse || iAmFalse;

        System.out.println("orResult1 = " + orResult1); // true
        System.out.println("orResult2 = " + orResult2); // true
        System.out.println("orResult3 = " + orResult3); // false

        System.out.println();

        // ## 논리 부정 연산자, !
        boolean notTrueResult = !iAmTrue;
        boolean notFalseResult = !iAmFalse;

        System.out.println("notTrueResult = " + notTrueResult); // false
        System.out.println("notFalseResult = " + notFalseResult); // true

    }

}
