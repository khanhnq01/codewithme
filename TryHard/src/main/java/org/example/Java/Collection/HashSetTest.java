package org.example.Java.Collection;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> setCar = new HashSet<String>();
        setCar.add("BMW");
        setCar.add("Audi");
        setCar.add("Mercedes");
        setCar.add("Lexus");
        setCar.add("Toyota");
        setCar.add("Honda");
        setCar.add("Lexus"); // Add duplicate value
        System.out.println("List of cars: " + setCar);
        System.out.println("Size of list: " + setCar.size());
        System.out.println("Remove the first car: " + setCar.remove("Lexus"));
        setCar.stream().sorted().forEach(System.out::println);
    }
}
