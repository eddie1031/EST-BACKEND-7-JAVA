package oop.inheritance;

public class SubClass extends BaseClass {

    public SubClass() {
    }

    public SubClass(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
        // 접근할 수 없음!
//        this.uniqueName = "SubClass";
    }

}
