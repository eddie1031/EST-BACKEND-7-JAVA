package controlStatement;

public class LoopStatement1 {

    public static void main(String[] args) {

        // # 제어문
        // ## 반복문
        // ### while

        // 조건식과 종료식의 잘못으로 인한 무한 반복(무한루프)
//        while ( true ) {
//            System.out.println("무한루프!");
//        }

        // 일반적인 반복문 구성
        int count = 0; // 초기식

        while ( count <= 10 ) { // 조건식
            System.out.println("count = " + count);
//            count = count + 1; // 증감식
            count++; // 증감식
        }

        // 명령문이 하나이면 body 생략 가능
        int b = 1;
        while ( b < 10 ) b*=2;
        System.out.printf("%d\n", b);

        int c = 1;
        while (c < 10)
            c *= 2;
        System.out.printf("%d\n",c);


    }

}
