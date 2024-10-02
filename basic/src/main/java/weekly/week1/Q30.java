package weekly.week1;

public class Q30 {

    /*
    다음의 조건에 따라 코드를 작성하고 결과를 스크린샷과 함께 제출해주세요.

    1. 1부터 1000까지의 수중 2의 배수의 합을 구해주세요.
    2. 1부터 1000까지의 수중 3의 배수의 갯수를 구해주세요.
    3. 출력 형식과 같이 출력해주세요.

    3의 배수의 갯수 : [정답1]
    2의 배수의 합 : [정답2]
     */
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        for ( int i = 0; i <= 1000; i++ ) {

            if ( i % 2 == 0 ) {
                a += i;
            }

            if ( i % 3 == 0 ) {
                b++;
            }

        }

        System.out.println("3의 배수의 갯수 : " + b);
        System.out.println("2의 배수의 합 : " + a);


    }



}
