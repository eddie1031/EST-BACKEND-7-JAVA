package typeConversion;

public class TypeConversion {

    public static void main(String[] args) {

        // # 형 변환

        // ## 묵시적 형변환(Implicit Type Conversion)
        int a = 10;
        double b = 20.5;

        System.out.println(a + b); // 30.5

        // ## 명시적 형변환(Explicit Type Conversion)
        int c = 10;
        double d = 1.3;

        System.out.println(a + (int) b); // 11
        
    }

}
