package generic.limit.example.S1.box;

public class Box<T> {

    T content;

    public Box(T content) {
        this.content = content;
    }

    public void open() {
        System.out.println("뚜껑을 열었습니다.");
        System.out.println("저는 " + content + "을/를 가지고 있습니다!");
    }

    public void close() {
        System.out.println("뚜껑을 닫았습니다.");
    }

}
