package methods;

public class Method7 {

    // Q1. 숫자(정수) 하나를 매개변수로 받아서
    // 그 숫자가 홀수인지 짝수인지를 출력하는 메서드를 정의해서
    // 10을 인자로 부여해서 실행해주세요!

    // Q2. 숫자(정수) 3개를 매개변수로 하여금 평균을 반환하는 함수를 정의하고,
    // <<같은 이름>>으로 구성된 메서드로 5개의 매개변수로서 합계를 반환하는 함수를 정의해서
    // 100, 80, 95 으로는 평균
    // 10 10 10 10 10 으로는 합계를 구하여,
    // 두개 모두 출력하는 예제를 만들어보세요!

    public static void main(String[] args) {

        // ctrl + alt + v -> 변수 추출
        // ctrl + alt + m -> 메서드 추출

        // Q1.
        int value = 10;
        solve(value);

        // Q2.
        int avg = solve2(100, 80, 95);
        int sum = solve2(10, 10, 10, 10, 10);

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);


    }

    // A2. 시작
    private static int solve2(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    private static int solve2(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }
    // A2. 끝

    // A1.
    private static void solve(int value) {
        if ( value % 2 == 0 ) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }




}
