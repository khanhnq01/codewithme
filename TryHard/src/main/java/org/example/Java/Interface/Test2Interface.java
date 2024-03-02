package org.example.Java.Interface;

public class Test2Interface implements ITest2Interfaces, IAnimal {
    @Override
    public void myMethod() {
        System.out.println("This is my method");
    }

    @Override
    public void myOtherMethod() {
        System.out.println("This is my other method");
    }

    @Override
    public void animalSound() {
        System.out.println("The animal says: animal sound");
    }

    @Override
    public void run() {
        System.out.println("The animal runs");
    }

    public static void main(String[] args) {
        Test2Interface myTest2Interface = new Test2Interface();
        myTest2Interface.myMethod();
        myTest2Interface.myOtherMethod();
        myTest2Interface.animalSound();
        myTest2Interface.run();
    }
}
