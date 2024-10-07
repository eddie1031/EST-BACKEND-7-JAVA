package oop.absctraction.example.S1;

public class Garden {

    public static void main(String[] args) {

        Dog dog = new Dog("해피");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.run(20);
        dog.hide("동굴");

        Cat cat = new Cat("해피");

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.run(20);
        cat.hide("동굴");

        cat.catsGender();
        cat.play("레이저 포인터");

    }

}
