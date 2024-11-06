package lambda;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTests {

    @Test
    @DisplayName("Consumer, Consumer<T> 테스트")
    void test1() throws Exception {

        Consumer<String> printer = (s) -> System.out.println(s);

        printer.accept("Hello, World!");

    }

    @Test
    @DisplayName("Consumer, BiConsumer<T, U> 테스트")
    void test2() throws Exception {

        BiConsumer<String, Integer> printer = (s1, i1) -> System.out.println(s1 + i1);
        printer.accept("I have value : ", 100);

    }


}
