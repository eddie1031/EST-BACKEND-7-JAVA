package operator;

public class AssignmentOperator {

    public static void main(String[] args) {

        // # 대입(Assignment) 연산자
        // ## 기본 대입 연산자
        int variableName = 10;

        // ## 복합 대입 연산자
        // ### 덧셈 복합 대입 연산자
        int a = 10;
        a = a + 1;
        a += 1;

        System.out.println("a = " + a); // 12

        // ### 뺄셈 복합 대입 연산자
        int b = 10;
        b = b - 1;
        b -= 1;

        System.out.println("b = " + b); // 8

        // ### 곱셈 복합 대입 연산자
        int c = 10;
        c = c * 2;
        c *= 2;

        System.out.println("c = " + c); // 40

        // ### 나눗셈 복합 대입 연산자
        int d = 100;
        d = d / 10;
        d /= 10;

        System.out.println("d = " + d); // 1

        // ### 나머지 복합 대입 연산자
        int e = 77;
        e = e % 12;
        e %= 2;

        System.out.println("e = " + e); // 1

    }

}
