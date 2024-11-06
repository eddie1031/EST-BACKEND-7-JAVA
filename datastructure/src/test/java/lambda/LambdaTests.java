package lambda;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LambdaTests {

    @Test
    @DisplayName("함수형 인터페이스 테스트")
    void functional_interface_test() throws Exception {

        PlusCalculator plus = new PlusCalculator() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };


        int result = plus.sum(1, 2);

        System.out.println(result);

    }

    @Test
    @DisplayName("람다표현식 1")
    void lambda_expression_1() throws Exception {

        PlusCalculator plus = (a, b) -> {
            return a + b;
        };

        int result = plus.sum(1, 2);

        System.out.println("result = " + result);

    }

    @Test
    @DisplayName("람다표현식 2")
    void lambda_expression_2() throws Exception {

        PlusCalculator plus = (a, b) -> a + b;

        int result = plus.sum(1, 2);
        System.out.println("result = " + result);

    }
    
    @Test
    @DisplayName("람다 표현식 곱셈")
    void multiple_test() throws Exception {
        MultipleCal cal = (a, b) -> a * b;
        int result = cal.multiple(2, 2);

        System.out.println("result = " + result);
        
    }

    interface MultipleCal {
        int multiple(int a, int b);
    }


}
