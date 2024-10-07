package oop.absctraction.example.S1;

public class Cat extends Animal{

    private String gender;

    public Cat(String name) {
        super(name);
        this.gender = "남자";
    }

    public void catsGender() {
        System.out.println(name + "의 성별은 " + gender + "입니다.");
    }

    public void play(String toy) {
        System.out.println(name + "이/가 " + toy + "을/를 가지고 놉니다.");
    }

    @Override
    public void eat() {
        System.out.println("생선을 먹습니다.");
    }

    @Override
    public void sleep() {
        System.out.println("낮잠을 잡니다.");
    }

    @Override
    public void drink() {
        System.out.println("물을 마십니다.");
    }

    @Override
    public void hide(String place) {
        System.out.println(name + "이/가 " + place + "에 숨었습니다.");
    }
}
