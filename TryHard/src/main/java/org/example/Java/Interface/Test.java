package org.example.Java.Interface;

public class Test {
    public static void main(String[] args) {
        System.out.println("--Dog--");
        IAnimal myDog = new Dog();
        myDog.animalSound();
        myDog.run();
        System.out.println("--Bird--");
        IAnimal myBird = new Bird();
        myBird.animalSound();
        myBird.run();
        System.out.println("--BabyDog--");
        IAnimal myBabyDog = new BabyDog();
        myBabyDog.animalSound();
        myBabyDog.run();
    }
}
