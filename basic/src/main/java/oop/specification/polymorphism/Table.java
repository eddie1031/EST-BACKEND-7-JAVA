package oop.specification.polymorphism;

public class Table {

    public static void main(String[] args) {
        meeting(new Bob(), new Sam());
    }

    static void meeting(Person person1, Person person2) {
        person1.sayHello();
        person2.sayHello();
    }

}
