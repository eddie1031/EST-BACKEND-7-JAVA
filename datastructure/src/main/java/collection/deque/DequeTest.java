package collection.deque;

public class DequeTest {

    public static void main(String[] args) {

        Deque<String> DQ = new Deque<>();

        System.out.println("스택에 값 추가");
        DQ.offer("사과");
        DQ.offer("참외");
        DQ.offer("망고");
        DQ.offer("포도");
        DQ.offer("금귤");
        DQ.print();

        System.out.println();
        // 덱에서 값을 제거
        System.out.println("큐에서 값을 제거");
        DQ.poll();
        DQ.print();

        System.out.println();

        // 덱에서 값을 제거
        System.out.println("큐에서 값을 제거");
        DQ.poll();
        DQ.print();

        System.out.println();

        // 덱에서 값을 제거
        System.out.println("큐에서 값을 제거");
        DQ.poll();
        DQ.print();

        System.out.println();

    }

}
