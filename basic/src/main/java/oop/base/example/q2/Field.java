package oop.base.example.q2;

public class Field {

    // main()
    // 여기는 사냥터입니다. 당신은 캐릭터를 생성하고, 상태를 확인한 다음
    // 무기를 구비하고 공격을 해볼 예정입니다.

    // 조건 1. Adventurer 클래스를 생성해주세요, 생성할때 이름은 필수입니다!
    // Adventurer는 공격을 할 수 있고 본인의 상태를 이야기 할 수 있습니다.
    // 본인의 상태는 이름, 소지하고 있는 무기입니다.
    // 조건 2. Sword 클래스를 생성해주세요 Sword는 이름이 있고 공격할 수 있습니다.
    // 조건 3. Adventurer는 무기 없이 공격하면 맨손을 휘두르고, 무기가 없을 땐 없다고 이야기 할 수 있어야 합니다.
    // 조건 4. Adventuer는 무기가 생기면 무기에 안에 선언된 공격을 해야합니다
    // 조건 5. Sword에는 공격 메서드가 존재합니다.

    public static void main(String[] args) {

        Adventurer adventurer = new Adventurer("김덕근");

        adventurer.checkMySelf();
        adventurer.attack();

        Sword sword = new Sword("야구방망이");

        adventurer.setSword(sword);
        adventurer.checkMySelf();

        adventurer.attack();


    }


}
