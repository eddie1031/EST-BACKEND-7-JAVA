package oop.interfaces.example.S2;

public class LaundryRoom2 {

    public static void main(String[] args) {

        SamsungWashingMachineV2 samsungWM = new SamsungWashingMachineV2();

        samsungWM.setSpeed(1);

        samsungWM.startButton();
        samsungWM.dry();
        samsungWM.stopButton();

        samsungWM.checkSpeed();

    }

}
