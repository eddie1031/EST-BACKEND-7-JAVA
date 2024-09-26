package controlStatement;

public class LoopStatement3 {

    public static void main(String[] args) {

        // # 제어문
        // ## 반복문
        // ### do - while

        int a = 1;

        do{
            a *= 2;
        } while ( a < 10 );

        System.out.println(a); // ?

        // do의 실행문이 1줄일 경우 바디({}) 생략가능
        int b = 1;
        do b *= 2; while(b < 10);
        System.out.println(b);

        // do - while은 거짓이어도 do를 한 번 수행하는 것을 보장
        int k = 10;
        do {
            k *= 2;
        } while( k<10);

        System.out.printf("k = %d\n", k);  // k = 20

        // 그러나 모든 do - while 은 while로 대체 가능
        int n = 10;

        while ( n <= 10 ) { // 한 번만 참(True)
            n *=2;
        }

        System.out.printf("n = %d\n", n); // 20

        // 조건식에 비교대상으로 사용될 값이 확정되지 않았거나 입력받아야 하는 상황이라면 do ~ while을 활용할 수 있다.

    }

}
