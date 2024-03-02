package org.example.Java.Polymorphism;

class Animal {
    public void eat() {
        System.out.println("This animal eats insects");
    }
}
class Dog extends Animal {
    public void eat() {
        System.out.println("This dog eats bones");
    }
}
class BabyDog extends Dog {
    public void eat() {
        System.out.println("This baby dog eats");
    }
}

public class Video47 {
    public static void main(String[] args) {
        Animal a = new BabyDog();
        a.eat();
    }
}
