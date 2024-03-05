package org.example.Java.Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Mercedes");
        cars.add("Lexus");
        cars.add("Toyota");

        Iterator<String> iterator = cars.iterator();

        System.out.println("first car: " + iterator.next());

        while (iterator.hasNext()) {
            System.out.println("Car: " + iterator.next());
        }
    }
}
