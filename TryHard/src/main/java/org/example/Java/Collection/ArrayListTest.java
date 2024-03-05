package org.example.Java.Collection;
import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> listCar = new ArrayList<String>();
        listCar.add("BMW");
        listCar.add("Audi");
        listCar.add("Mercedes");
        listCar.add("Lexus");
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
