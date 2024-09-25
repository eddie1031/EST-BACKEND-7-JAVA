package variable;

public class IntegerDataType {

    public static void main(String[] args) {

        // # 1. 원시 자료형[기본 자료형](Primitive Type)

        // # 1-1. 정수 자료형
        // byte  (1byte)
        // short (2byte)
        // int   (4byte)
        // long  (8byte)

        // byte
        byte tinyNumber1 = 127;
        byte tinyNumber2 = -127;
//        byte tinyNumber3 = 128; 범위를 벗어났기 때문에 초기화 불가!

        // short
        short cuteNumber1 = 32767;
        short cuteNumber2 = -32768;
//        short cuteNumber3 = 32768; 범위를 벗어났기 때문에 초기화 불가!

        // int
        int generalNumber1 = 2_147_483_647;
        int generalNumber2 = -2_147_483_648;
//        int generalNumber3 = 2147483648; 범위를 벗어났기 때문에 초기화 불가!

        int tenDecimal = 10; // 10진수
        int tenBinary = 0b1010; // 2진수
        int tenOctal = 012; // 8진수
        int tenHexadecimal = 0xA; // 16진수

        System.out.println("tenDecimal = " + tenDecimal);
        System.out.println("tenBinary = " + tenBinary);
        System.out.println("tenOctal = " + tenOctal);
        System.out.println("tenHexadecimal = " + tenHexadecimal);

        // long
        long hugeNumber1 = 9_223_372_036_854_775_807L;
        long hugeNumber2 = -9_223_372_036_854_775_808L;
//        long hugeNumber3 = 9_223_372_036_854_775_808L; 범위를 벗어났기 때문에 초기화 불가!


    }

}
