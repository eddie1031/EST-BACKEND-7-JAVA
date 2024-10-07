package oop.absctraction;

public class JPhone16 extends SmartestPhone {

    private final boolean type;

    public JPhone16(boolean power, int sound, int lightLevel, boolean type) {
        super(power, sound, lightLevel);
        this.type = type;
    }

    @Override
    public void msg() {
        if ( this.type ) {
            System.out.println("파란색");
        } else {
            System.out.println("초록색");
        }
    }

    @Override
    public void call() {
        if ( this.power ) {
            System.out.println("통화");
        }
    }

}
