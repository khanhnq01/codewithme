package org.example.Java.Collection;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> listCar = new LinkedList<String>();
        listCar.add("BMW");
        listCar.add("Audi");
        listCar.add("Mercedes");
        listCar.add("Lexus");
        listCar.add("Toyota");
        listCar.add("Honda");
        //listCar.add("Lexus"); // Add duplicate value
        System.out.println("List of cars: " + listCar);
        System.out.println("Size of list: " + listCar.size());
        System.out.println("Get the first car: " + listCar.get(0));
        System.out.println("Remove the first car: " + listCar.remove(listCar.size() - 1));
        System.out.println("List of cars: " + listCar);
        listCar.add(1, "Toyota");
        for (String car : listCar) {
            System.out.println("Car: " + car);
        }
    }
}
