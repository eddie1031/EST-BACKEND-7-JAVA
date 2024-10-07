package oop.absctraction.example.S1;

//public abstract class Animal {
public class Animal {

    public String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

//    public abstract void eat();
//    public abstract void sleep();
//    public abstract void drink();

    public void eat(){};
    public void sleep(){};
    public void drink(){};

    public void run(int speed) {

    }

//    public abstract void hide(String place);
    public void hide(String place){};

}
