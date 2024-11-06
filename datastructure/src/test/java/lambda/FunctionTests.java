package lambda;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionTests {

    @Test
    @DisplayName("Function, Function<T, R> 테스트")
    void test1() throws Exception {

        int target = 100;

        Function<Integer, String> intToStr = (i1) -> String.valueOf(i1);

        String result = intToStr.apply(target);

        System.out.println("result = " + result);

    }


}
