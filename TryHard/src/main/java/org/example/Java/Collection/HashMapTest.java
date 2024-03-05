package org.example.Java.Collection;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "BMW");
        map.put(2, "Audi");
        map.put(3, "Mercedes");
        map.put(4, "Lexus");
        map.put(5, "Toyota");
        map.put(6, "Honda");
        map.put(7, "Lexus"); // Add duplicate value
        System.out.println("List of cars: " + map);
        System.out.println("Size of list: " + map.size());
        System.out.println("Get the first car: " + map.get(1));
        System.out.println("Remove the first car: " + map.remove(3));
        System.out.println("List of cars: " + map);
    }
}
