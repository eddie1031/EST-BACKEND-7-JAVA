package oop.base.example.q2;

public class Adventurer {

    // 이름
    private String name;

    public Adventurer(String name) {
        this.name = name;
    }

    // 상태
    private Sword sword;

    // 행동

    // 검 장착
    public void setSword(Sword sword) {
        this.sword = sword;
        System.out.println(this.name + "은 " + sword.getName() + " 을/를 장착 완료 했습니다!");
    }

    // 공격
    public void attack() {

        if ( this.sword == null ) {
            System.out.println("맨손을 휘둘렀습니다.");
        } else {
            this.sword.attack();
        }

    }

    // 상태점검
    public void checkMySelf() {

        // 이름 이야기
        System.out.println("제 이름은 " + this.name + " 입니다.");

        // 무기가 있는지 없는지를 검사해서
        // 무기가 있으면 어떤 무기인지 알려주고,
        if ( sword != null ) {
            System.out.println("제가 지니고 있는 무기는 " + sword.getName() + " 입니다.") ;
        } else {
            System.out.println("저는 무기가 따로 없습니다.");
        }
        // 무기가 없으면 무기가 없다고 알려준다

    }


}
