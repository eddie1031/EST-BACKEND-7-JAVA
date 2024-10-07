package oop.inheritance.spr.example.S1;

public class Car {

    public String carName = "car";
    public int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public void sayName() {
        System.out.println("차 이름 : " + this.carName);
    }

    public void drive() {
        System.out.println(this.speed + " km/h로 달립니다.");
    }

}
