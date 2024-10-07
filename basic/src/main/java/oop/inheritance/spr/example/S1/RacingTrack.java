package oop.inheritance.spr.example.S1;

public class RacingTrack {

    public static void main(String[] args) {
        test1();
    }

    // Car와 PMW 테스트
    static void test1() {
        PWM car = new PWM(100, "검정색");
        car.printInfo();
    }


}
