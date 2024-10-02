package oop.base.example.q1;

import oop.base.example.q1.game.AnimalDross;
import oop.base.example.q1.game.DuperMario;
import oop.base.example.q1.game.Xelda;
import oop.base.example.q1.machine.MintendoSwitch;


public class Play {

    // 민텐도 스위치를 생성하고 동물들의 밀림, 셀다, 듀퍼마리오를 플레이하고자 합니다.
    // 동물들의 밀림(AnimalDross), 셀다(Xelda), 듀퍼마리오(DuperMario)

    // 조건 1. 민텐도 스위치 본체 Class를 생성해주세요
    // 조건 2. 게임 타이틀 3개를 생성해주세요
    // 조건 3. 본체에 타이틀은 한개만 장착할 수 있습니다. 다른 타이틀 장착시 기존 타이틀을 null로 없애주세요
    // 조건 4. 본체에 전원이 들어와있어야만 실행하거나 조작할 수 있습니다.
    // 조건 4-1. 본체에 전원이 들어와 있어야지만 게임을 할 수 있습니다.
    // 조건 5. 이미 본체에 전원이 있거나 없는데 중복조작은 안됩니다.
    // 조건 6. main 메서드에서 실행 후 출력을 보여주세요!

    // 문제 1. 민텐도 스위치 추상화
    // 문제 2. 게임 타이틀 3개 추상화

    public static void main(String[] args) {

        AnimalDross 동물의밀림 = new AnimalDross();
        DuperMario 듀퍼마리오 = new DuperMario();
        Xelda 줼다 = new Xelda();

        MintendoSwitch 스위치 = new MintendoSwitch();

        스위치.playGame();
        스위치.setChip(줼다);

//        스위치.playGame();

        스위치.powerOn();
        스위치.powerOn();

        스위치.checkChip();

        스위치.playGame();
        스위치.exitGame();

        스위치.setChip(동물의밀림);

        스위치.playGame();
        스위치.exitGame();

        스위치.powerOff();
        스위치.powerOff();

    }



}
