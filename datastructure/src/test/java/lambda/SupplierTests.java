package lambda;

import lombok.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

public class SupplierTests {

    @Test
    @DisplayName("Supplier, Supplier<T> 테스트")
    void test1() throws Exception {

        Supplier<Member> adminSupplier = () -> new Member(
                1L,
                "admin",
                "admin"
        );

        Member admin = adminSupplier.get();

        System.out.println("admin = " + admin);

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class Member {
        private Long memberId;
        private String username;
        private String password;
    }


}
