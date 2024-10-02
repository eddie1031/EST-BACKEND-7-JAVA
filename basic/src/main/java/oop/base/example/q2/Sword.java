package oop.base.example.q2;

public class Sword {

    private String name;

    public Sword(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void attack() {
        System.out.println(this.name + " 을/를 휘둘렀습니다.");
    }

}
