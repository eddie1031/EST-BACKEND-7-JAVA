package oop.absctraction;

public abstract class SmartestPhone {

    public boolean power;
    private int sound;

    private int lightLevel;

    public SmartestPhone(boolean power, int sound, int lightLevel) {
        this.power = power;
        this.sound = sound;
        this.lightLevel = lightLevel;
    }

    public void powerSwitch() {
        if ( power ){
            System.out.println("전원을 끕니다.");
            this.power = false;
        } else {
            System.out.println("전원을 켭니다.");
            this.power = true;
        }
    }

    public abstract void call();
    public abstract void msg();

}
