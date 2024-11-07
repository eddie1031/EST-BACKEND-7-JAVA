

import collection.arrayList.List;
import collection.queue.Queue;
import collection.stack.Stack;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class StreamTests {

    @Test
    @DisplayName("큐 스트림 테스트")
    void Q_STREAM_TEST() throws Exception {
        Queue<Integer> Q = new Queue<>();

        Q.add(1);
        Q.add(1);
        Q.add(2);
        Q.add(2);
        Q.add(3);
        Q.add(1);

        List<Integer> list = Q.stream().map(
                n -> n * 2
        ).toList();

        System.out.println("list.size() = " + list.size());

        List<Integer> list1 = list.stream()
                .filter(n -> n == 2)
                .toList();

        System.out.println("list1.size() = " + list1.size());
    }

}
