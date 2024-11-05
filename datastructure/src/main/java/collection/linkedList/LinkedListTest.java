package collection.linkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        System.out.println("리스트에 값을 추가합니다.");
        list.add("사과");
        list.add("딸기");
        list.add("포도");
        list.add("망고");
        list.traverse();

        System.out.println();

        System.out.println("첫 번째 인덱스에 배를 추가합니다.");
        list.traverse();
        System.out.println("배 추가");
        list.addFirst("배");
        list.traverse();

        System.out.println();

        System.out.println("마지막 번째 인덱스에 샤인머스켓을 추가합니다.");
        list.traverse();
        System.out.println("샤인머스켓 추가");
        list.addLast("샤인머스켓");
        list.traverse();

        System.out.println();

        System.out.println("2번 인덱스의 값을 삭제합니다.");
        list.traverse();
        System.out.println("삭제");
        list.remove(2);
        list.traverse();

        System.out.println();

        System.out.println("0번 인덱스의 값을 삭제합니다.");
        list.traverse();
        System.out.println("삭제");
        list.removeFirst();
        list.traverse();

        System.out.println();

        System.out.println("마지막 인덱스의 값을 삭제합니다.");
        list.traverse();
        System.out.println("삭제");
        list.removeLast();
        list.traverse();

        System.out.println();

        System.out.println("값으로 삭제 테스트");

        System.out.println("포도 추가");
        list.add("포도");
        list.traverse();

        System.out.println("포도를 값으로서 삭제");
        list.remove("포도");

        list.traverse();

        System.out.println("특정 인덱스 값 변경");

        System.out.println("1번째 인덱스 값 사탕으로 변경");
        list.set(1, "사탕");
        list.traverse();

    }

}
