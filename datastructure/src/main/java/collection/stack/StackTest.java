package collection.stack;

public class StackTest {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        System.out.println("스택에 값 추가");
        stack.push("사과");
        stack.push("참외");
        stack.push("망고");
        stack.push("포도");
        stack.push("금귤");
        stack.print();

        System.out.println();

        System.out.println("스택에서 값 하나 꺼내기");
        stack.pop();
        stack.print();

        System.out.println();

        System.out.println("스택에서 값 하나 꺼내기");
        stack.pop();
        stack.print();

        System.out.println();

        System.out.println("스택에서 값 하나 꺼내기");
        stack.pop();
        stack.print();

        System.out.println();

        System.out.println("스택에 add로 값 추가");
        stack.add("설탕");
        stack.print();

        System.out.println();

        System.out.println("스택에 remove로 값 제거");
        System.out.println("사과 제거 시도");
        stack.remove("사과");
        stack.print();

        System.out.println();

        System.out.println("설탕 제거");
        stack.remove("설탕");
        stack.print();

        System.out.println("제일 위(마지막) 값 꺼내기");
        String top = stack.top();
        System.out.println("top = " + top);

        System.out.println();

        System.out.println("스택 출력");
        stack.print();

    }

}
