package lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.List;
import java.util.function.IntPredicate;

public class PredicateTests {

    @Test
    @DisplayName("Predicate 테스트")
    void test1() throws Exception {

        List<Member> memberList = List.of(
                new Member("A", 10),
                new Member("B", 40),
                new Member("C", 30),
                new Member("D", 50)
        );

        IntPredicate sorting = (value) -> {
            return value >= 40;
        };

        for ( int i = 0; i < memberList.size() ; i++ ) {
            Member member = memberList.get(i);

            boolean isEnough = sorting.test(member.getValue());

            if ( isEnough ) {
                System.out.println("Enough!");
                System.out.println(member.getName());
            } else {
                System.out.println("Not enough!");
                System.out.println(member.getName());
            }

        }


    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Member {
        private String name;
        private int value;
    }

}
