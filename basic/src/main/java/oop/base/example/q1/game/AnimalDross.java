package oop.base.example.q1.game;

public class AnimalDross {

    // 상태
    // 1. 내가 무슨 게임인가? -> 게임 이름
    private String name = "놀러가요 동물의 밀림";

    // 행동
    // 1. 실행
    public void launch() {
        System.out.println(name + "을 실행했습니다!");
    }
    // 2. 종료
    public void exit() {
        System.out.println(name + "을 종료했습니다!");
    }

    // 3. 무슨게임인지 알려주는
    public String getName() {
        return name;
    }
}
