package operator;

public class ArithmeticOperator {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // # 산술 연산자
        // ## 덧셈 연산자
        int sum = a + b; // 변수를 값으로서 사용

        System.out.println("sum = " + sum); // 15
        System.out.println("Hello, " + "World!"); // Hello, World!
                                                  // 문자열과 문자열을 붙일때도 사용 가능

        // ## 뺄셈 연산자
        int minus = a - b;

        System.out.println("minus = " + minus); // 5

        // ## 곱셈 연산자
        int multiply = a * b;

        System.out.println("multiply = " + multiply); // 50

        // ## 나눗셈 연산자
        int divide = a / b;

        System.out.println("int = " + divide); // 2
        System.out.println("double = " + (double) 5 / 2); // 2.5

        // ## 나머지 연산자
        int c = 10, d = 3;
        int remainder = c % d;

        System.out.println("remainder = " + remainder); // 1

        // ## 증감연산자
        // ### 증가 연산자
        int e = 10;

        // #### 전위 표기 - 값을 먼저 증가한 다음 나머지 연산 수행
        ++e;
        System.out.println("e = " + e); // 11

        e = 10; // e 값 10으로 초기화

        // #### 후위 표기 - 값을 먼저 사용한 다음 증가하고 나머지 연산 수행
        e++;
        System.out.println("e = " + e); // 11

        // Q1.
        int first = 5;

        int question1 = ++first * 3;
        System.out.println("question1 = " + question1); // ?
        System.out.println("first = " + first); // ?

        first = 5;

        int question2 = first++ * 3;
        System.out.println("question2 = " + question2); // ?
        System.out.println("first = " + first); // ?

        // ### 감소 연산자
        int f = 10;

        // #### 전위 표기 - 값을 먼저 감소한 다음 나머지 연산 수행
        ++f;
        System.out.println("f = " + f); // 11

        f = 10; // f 값 10으로 초기화

        // #### 후위 표기 - 값을 먼저 사용한 다음 감소하고 나머지 연산 수행
        f++;
        System.out.println("f = " + f); // 11

        // Q2.
        int second = 5;

        int question3 = --second * 3;
        System.out.println("question3 = " + question3); // ?
        System.out.println("second = " + second); // ?

        second = 5;

        int question4 = second-- * 3;
        System.out.println("question4 = " + question4); // ?
        System.out.println("second = " + second); // ?

    }

}
