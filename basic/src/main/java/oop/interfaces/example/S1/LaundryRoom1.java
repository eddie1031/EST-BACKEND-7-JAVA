package oop.interfaces.example.S1;

public class LaundryRoom1 {

    public static void main(String[] args) {

        SamsungWashingMachineV1 samsungWM = new SamsungWashingMachineV1();

        samsungWM.setSpeed(1);

        samsungWM.startButton();
        samsungWM.stopButton();

        samsungWM.checkSpeed();

    }

}
