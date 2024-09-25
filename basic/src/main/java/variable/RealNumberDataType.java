package variable;

public class RealNumberDataType {

    public static void main(String[] args) {

        // # 1-2. 실수 자료형
        // float (4byte)
        // double (8byte)

        // float
        float fpi = 3.13f;

        // float의 오차발생
        float fa = .3f - .125f;
        System.out.println(fa); // 0.17500001

        double dpi = 3.141592;

        // float과 비교하여 상대적으로 개선된 오차
        double db = .3 - .125;
        System.out.println(db); // 0.175

    }

}
