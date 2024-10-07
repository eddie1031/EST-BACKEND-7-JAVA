package oop.inheritance.spr.example.S1;

public class PWM extends Car {

    public String color;

    public PWM(int speed, String color) {
        super(speed);
        this.color = color;
    }

    public void printInfo() {
        super.sayName();
        super.drive();
        System.out.println("차 색상은 " + this.color + " 입니다.");
    }

}
