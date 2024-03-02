package org.example.Java.Interface;

public class BabyDog implements IAnimal{
    @Override
    public void animalSound() {
        System.out.println("The baby dog says: bow wow");
    }

    @Override
    public void run() {
        System.out.println("The baby dog runs");
    }
}
