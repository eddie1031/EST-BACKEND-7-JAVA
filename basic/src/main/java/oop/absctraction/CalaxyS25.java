package oop.absctraction;

public class CalaxyS25 extends SmartestPhone {

    // 통화녹음
    private int record;

    public CalaxyS25(boolean power, int sound, int lightLevel) {
        super(power, sound, lightLevel);
    }

    @Override
    public void call() {
        if ( this.power ) {
            System.out.println("전화를 겁니다");
            record++;
        }
    }

    @Override
    public void msg() {

    }

}
