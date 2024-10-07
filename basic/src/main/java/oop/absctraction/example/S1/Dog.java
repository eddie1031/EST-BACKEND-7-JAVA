package oop.absctraction.example.S1;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " 이/가 개껌을 먹습니다.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " 이/가 낮잠을 잡니다.");
    }

    @Override
    public void drink() {
        System.out.println(name + "이/가 물을 마십니다.");
    }

    @Override
    public void run(int speed) {
        System.out.println(name + " 이/가 " + speed + " km/h로 달립니다.");
    }

    @Override
    public void hide(String place) {
        System.out.println(name + " 이/가 " + place + "에 숨었습니다.");
    }

}
