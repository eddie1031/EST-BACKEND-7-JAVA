package controlStatement;

public class SelectionStatement1 {

    public static void main(String[] args) {

        // # 제어문
        // ## 선택문

        // ### if
        if(true){
            System.out.println("result : true"); // 실행
        }

        if(false){
            System.out.println("result : true"); // 실행되지 않음
        }

        if(!true) {
            System.out.println("result : true"); // 실행되지 않음
        }

        if(!false){
            System.out.println("result : true"); // 실행
        }


        if(false){
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
        }

        System.out.println(5); // 5

        // 실행문이 한 줄일 때
        if (true) System.out.println("1"); // 1 출력

        if (true)
            System.out.println("1"); // 1 출력

        // ### if문 중첩
        int a = 10, b = 20;

        if( (a >= 10) && (b >= 0) ) {
            b=1;
        }
        if ( (a >= 10 ) && ( b < 0 ) ) {
            b=-1;
        }

        System.out.println("b = " + b);

        // a, b 초기화
        a = 10;
        b = 20;

        if ( a >= 10 ) {
            if ( b >= 0 ) {
                b = 1;
            }
            else {
                b = -1;
            }
        }

        System.out.println("b = " + b);

        // ### Dangling Else Problem
        if( 1 == 0 )
            if( 1 == 1)
                System.out.println("1");
        else
            System.out.println("2");

        // 실제로는 아무것도 출력되지 않음
        // else가 가장 가까운 if에 달라붙어 실행되기 때문이다.

    }

}
