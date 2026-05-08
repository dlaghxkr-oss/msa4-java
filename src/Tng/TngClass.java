package Tng;

class Person {
    String name;
    int age;

    void sayHello() {
        System.out.println("안녕하세요");
    }
}

public class TngClass {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "민재";
        p1.age = 30;

        System.out.println(p1.name);
        System.out.println(p1.age);

        p1.sayHello();
    }
}
