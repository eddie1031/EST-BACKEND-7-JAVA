package weekly.week1;

public class Q29 {

    /*
    다음의 조건에 따라 코드를 작성하고 결과를 스크린샷과 함께 제출해주세요.

    1. 2부터 1000까지의 자연수 중 `소수`를 출력해주세요.
    2. `소수`란 1과 자기 자신으로만 나누어 떨어지는 수를 의미합니다.
     */

    public static void main(String[] args) {

        for ( int i = 2; i <= 1000; i++ ) {

            int count = 0;

            for ( int j = 1; j <= i; j++ ) {
                if ( i % j == 0 ) {
                    count++;
                }
//                if ( count >= 3 ) break; // 조금이나마 속도 개선
            }

            if ( count == 2 ){
                System.out.print(i + " ");
            }

        }

    }


}
