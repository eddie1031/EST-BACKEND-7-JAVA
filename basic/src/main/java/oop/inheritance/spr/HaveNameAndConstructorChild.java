package oop.inheritance.spr;

public class HaveNameAndConstructorChild
        extends HaveNameAndConstructorParent {

    // 상위 클래스에 기본 생성자(매개변수 없는 생성자)가 없으면
    // 반드시 super() 를 알맞게 호출해주어야지만 컴파일 오류가 발생하지 않음

    public HaveNameAndConstructorChild() {
        super("Name");
    }

    public HaveNameAndConstructorChild(String name) {
        super(name);
    }

}
