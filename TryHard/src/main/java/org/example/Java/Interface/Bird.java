package org.example.Java.Interface;

public class Bird implements IAnimal{
    @Override
    public void animalSound() {
        System.out.println("The bird says: tweet tweet");
    }

    @Override
    public void run() {
        System.out.println("The bird runs");
    }
}
