package controlStatement;

public class Continue1 {

    public static void main(String[] args) {

        // # 제어문
        // ## 분기문
        // ### continue
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Count " + i);
        }
        //Count 0
        //Count 1
        //Count 2
        //Count 3
        //Count 4
        //Count 6
        //Count 7
        //Count 8
        //Count 9

        // continue 사용시, 조건에 실수를 하면 무한루프에 빠질 수 있음
        int m=1, tSum=0;

        while( m<=100 ){
            if( tSum % 3 == 0 ) continue; // continue를 만나면
            tSum+=m;
            m++;
        } // 이곳으로 이동된다. 이 때 증감식인 m++를 만나지 않기 때문에 다시 조건식으로 가고 continue를 만나고 다시 여기로 오고가 반복되어 무한반복에 빠진다.

        // Q1. 1부터 10까지의 자연수 중 홀수만 출력해주세요
        for ( int i = 1; i <= 10; i++) {
            if ( i % 2 == 0 ) {
                continue;
            }
            System.out.println(i);
        }


    }

}
