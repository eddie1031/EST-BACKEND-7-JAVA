package operator;

public class BitwiseOperator {

    public static void main(String[] args) {

        // # 비트 연산자

        // ## 비트 논리 연산자
        // ### 비트별 논리곱 (비트 AND 연산자), &
        int result = 0b0000_0101
                   & 0b0000_0011;
        //             0000 0001

        System.out.println("result = " + result); // 1

        // ### 비트별 논리합 (비트 OR 연산자), |
        result = 0b0000_0101
               | 0b0000_0011;
//                 0000 0111

        System.out.println("result = " + result); // 7

        // ### 비트 XOR 연산자 (exclusive), ^
        result = 0b0000_0101
               ^ 0b0000_0011;
//                 0000 0110

        System.out.println("result = " + result); // 6

        // ### 비트 부정 연산자, ~
        int five = 0b0000_0101;
        int bitNotResult = ~five;

        System.out.println("bitNotResult = " + bitNotResult); // -6

        // ## 비트 이동 연산자
        // ### 좌측 이동 연산자
        result = 0b0000_0101 << 1;
        //         0000_1010

        System.out.println("result = " + result); // 10

        // ### 우측 이동 연산자
        result = 0b0000_0101 >> 1;
        //         0000_0010

        System.out.println("result = " + result); // 2

        // ### 부호없는 우측 우측 이동 연산자
        result = -0b10100 >>> 2;
          //      0011 1111 1111 1111 1111 1111 1111 1011

        System.out.println("result = " + result); // 1,073,741,819



    }

}
