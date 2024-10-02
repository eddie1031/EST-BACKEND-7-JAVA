package weekly.week1;

public class Q28 {

    /*
    다음의 조건에 따라 코드를 작성하고 결과를 스크린샷과 함께 제출해주세요.

    1. 1부터 10까지의 숫자를 `홀수`만 출력해주세요.
    2. 숫자는 한 줄로 각각의 숫자는 띄어쓰기로 구분됩니다.
    예시)
    1 3 5 7 9
     */
    public static void main(String[] args) {

        for ( int i = 0; i < 10; i++ ) {
            if ( i % 2 != 0 ) {
                System.out.print(i + " ");
            }
        }

    }


}
