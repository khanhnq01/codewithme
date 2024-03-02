package org.example.Java.Interface;

public class Dog implements IAnimal{
    @Override
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }

    @Override
    public void run() {
        System.out.println("The dog runs");
    }
}
