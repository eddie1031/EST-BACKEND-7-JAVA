package oop.interfaces.example.S2;

import oop.interfaces.example.S1.WashingMachine;

public class SamsungWashingMachineV2
        implements WashingMachine, DryMachine {

    private int speed = 0;

    @Override
    public void startButton() {
        if (speed == 0) {
            System.out.println("세탁기 속도를 올려주세요!");
        } else {
            System.out.println("세탁을 시작했습니다!");
        }
    }

    @Override
    public void pauseButton() {
        if ( speed != 0 ) {
            System.out.println("세탁기를 중지합니다.");
            speed = 0;
        } else {
            System.out.println("이미 세탁기가 멈춰있습니다.");
        }
    }

    @Override
    public void stopButton() {
        if ( speed != 0 ) {
            System.out.println("세탁기를 중지합니다.");
            speed = 0;
        } else {
            System.out.println("이미 세탁기가 멈춰있습니다.");
        }
    }

    @Override
    public int setSpeed(int speed) {
        switch (speed) {
            case 1:
                this.speed = 20;
                System.out.println("세탁시간이 20분 소요됩니다.");
                break;
            case 2:
                this.speed = 50;
                System.out.println("세탁시간이 50분 소요됩니다.");
                break;
            case 3:
                this.speed = 100;
                System.out.println("세탁시간이 100분 소요됩니다.");
                break;
        }
        return this.speed;
    }

    public void checkSpeed() {
        if ( this.speed == 0) {
            System.out.println("속도를 설정해주세요");
        } else {
            System.out.println("세탁기에 설정된 시간은 " + this.speed + "분 입니다.");
        }
    }

    @Override
    public void dry() {
        System.out.println("빨래 건조를 시작합니다.");
    }

}
