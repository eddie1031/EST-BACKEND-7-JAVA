package oop.base.example.q1.machine;

import oop.base.example.q1.game.AnimalDross;
import oop.base.example.q1.game.DuperMario;
import oop.base.example.q1.game.Xelda;

public class MintendoSwitch {

    // 상태
    // 1. 전원이 있는지 없는지
    private boolean power = false;

    // 2. 게임칩셋 1
    private Xelda game1;
    // 3. 게임칩셋 2
    private AnimalDross game2;
    // 4. 게임칩셋 3
    private DuperMario game3;

    // 행동
    // 1. 전원 켜기
    public void powerOn() {

        // 만약에 전원이 켜져있으면?
        // 켜지 않는다
        if ( power ) {
            System.out.println("이미 전원이 켜져 있습니다.");
            return;
        }

        // 그렇지 않고 꺼져있으면?
        // 켠다
        power = true;
        System.out.println("스위치의 전원을 켰습니다!");

    }

    // 2. 전원 끄기
    public void powerOff() {

        // 만약에 본체의 전원이 종료되어있으면?
        // 다시 종료하지 않는다.
        if ( !power ) {
            System.out.println("이미 전원이 꺼져있습니다!");
            return;
        }

        // 만약에 그렇지 않으면?(켜져있으면)
        // 종료한다.
        power = false;
        System.out.println("스위치 전원을 종료했습니다!");

    }

    // 3. 칩셋이 장착되어있는가? -> 칩셋 확인
    public void checkChip() {

        // 닌텐도의 전원이 켜져있는가?
        if ( !power ) {
            System.out.println("닌텐도의 전원을 먼저 켜주시기 바랍니다.");
            return;
        }

        // 어떤 칩이 장착되어 있는가? 출력
        // 만약 칩이 있으면 -> 출력
        if ( game1 != null ) { // Null Pointer Exception
            System.out.println("현재 장착되어 있는 칩은 " + game1.getName() + " 입니다.");
        } else if ( game2 != null ) {
            System.out.println("현재 장착되어 있는 칩은 " + game2.getName() + " 입니다.");
        } else if ( game3 != null ) {
            System.out.println("현재 장착되어 있는 칩은 " + game3.getName() + " 입니다.");
        } else { // 없으면 없다고 출력
            System.out.println("현재 칩이 장착되어 있지 않습니다.");
        }

    }

    // 4. 칩셋 장착(게임1, 2, 3)
    public void initChip() {
        game1 = null;
        game2 = null;
        game3 = null;

        System.out.println("게임기에 장착되어있던 모든 칩을 제거했습니다!");
    }

    public void setChip(Xelda chip) {

        game1 = chip;
        game2 = null;
        game3 = null;

        System.out.println(chip.getName() + "을/를 장착했습니다.");
    }

    public void setChip(AnimalDross chip) {

        game1 = null;
        game2 = chip;
        game3 = null;

        System.out.println(chip.getName() + "을/를 장착했습니다.");
    }

    public void setChip(DuperMario chip) {

        game1 = null;
        game2 = null;
        game3 = chip;

        System.out.println(chip.getName() + "을/를 장착했습니다.");
    }
    // 5. 게임 플레이
    public void playGame() {

        // 전원 여부 확인
        if ( !power ) {
            System.out.println("민텐도 스위치 본체의 전원을 먼저 켜주세요!");
            return;
        }

        // 칩셋 확인
            // 게임 실행
        // 칩셋이 없다
        if ( game1 != null ) {
            game1.launch();
        } else if ( game2 != null ) {
            game2.launch();
        } else if ( game3 != null ) {
            game3.launch();
        } else {
            System.out.println("현재 장착되어있는 칩이 없습니다!");
        }

    }

    // 6. 게임 종료
    public void exitGame() {
        // 전원 여부 확인
        if ( !power ) {
            System.out.println("민텐도 스위치 본체의 전원을 먼저 켜주세요!");
            return;
        }

        // 칩셋 확인
        // 게임 실행
        // 칩셋이 없다
        if ( game1 != null ) {
            game1.exit();
        } else if ( game2 != null ) {
            game2.exit();
        } else if ( game3 != null ) {
            game3.exit();
        } else {
            System.out.println("현재 장착되어있는 칩이 없습니다!");
        }

    }



}
