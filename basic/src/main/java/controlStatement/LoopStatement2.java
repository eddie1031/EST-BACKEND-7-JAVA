package controlStatement;

public class LoopStatement2 {

    public static void main(String[] args) {

        // # 제어문
        // ## 반복문
        // ### for

        // 일반적인 for문 형태
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

//        System.out.println("i = " + i); // 출력 불가능, i 변수는 for 구문 안에서만 존재!


        int a = 0; // 초기식
        for (; a < 10; a++) { // 외부 변수 이용한 for 문 작성 가능
            System.out.println(a);
        }


//        for 문을 이용한 무한루프
//        for (;;) {
//            System.out.println("무한루프!");
//        }


        // 반복문이 많이 중첩될수록 성능에 좋지 못함
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                for (int k = 1; k <= 10; k++) {
//
//                    // ...
//
//                }
//            }
//        }

        // 초기식에 2개의 변수 선언 가능
        for ( int i = 0, j = 0; i < 10; i++ ) {
            System.out.println("i = " + i);

            if ( i > 4 ) {
                j++;
            }

            System.out.println("j = " + j);
        }

        // 감소조건도 가능
        for ( int k = 10; k > 0; k-- ) {
            System.out.println("k = " + k);
        }

        // Q1.
        // 구구단 7단을 출력해주세요.
        // 예시 ) 7 x 1 = 7
        //       7 x 2 = 14
        //       ...
        //       7 x 9 = 63
        for ( int i = 1; i < 10; i++ ) {
//            System.out.println("7 x " + i + " = " + (7 * i));
            System.out.printf("7 x %d = %d\n", i,  i * 7);
        }

        // Q2.
        // 1 부터 10까지의 자연수를 아래의 조건에 따라 출력합니다.
        // 1. 짝수일때는 숫자 뒤에 " 짝수" 를 붙여주세요.
        // 2. 홀수일때는 숫자 뒤에 " 홀수" 륿 붙여주세요
        // 예시)
        // 1 홀수
        // 2 짝수
        // ..
        // 10 홀수
        for (int i = 1; i <= 10; i++) {
            if ( i % 2 == 0 ) {
                System.out.println(i + " 짝수");
            } else {
                System.out.println(i + " 홀수");
            }
        }

        // Q3. 5 x 5 크기의 *로 구성된 직사각형을 출력해주세요
        // 예시)
        // *****
        // *****
        // *****
        // *****
        // *****
        for ( int i = 0; i < 5; i++) {
            for ( int j = 0; j < 5; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 초기식
        // for ( int j = 0; j < 5; j++ ) {
        //   System.out.print("*");
        // }

        // Q4. 구구단을 2단부터 9단까지 각 단별로 공백을 구분으로 출력해주세요
        // 예시)
        // 2 x 1 = 2
        // ...
        // 2 x 9 = 18
        //
        // 3 x 1 = 3
        // ..
        // 9 x 9 = 81
        for ( int i = 2; i < 10; i++ ) {
            for ( int j = 1; j < 10; j++ ) {
                System.out.printf("%d x %d = %d\n", i, j, (i * j));
            }
            System.out.println();
        }

    }

}
