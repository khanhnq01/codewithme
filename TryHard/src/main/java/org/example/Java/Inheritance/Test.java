package org.example.Java.Inheritance;

public class Test {
    public static void main(String[] args) {
        StudentIT studentIT = new StudentIT("Java", "1", "Huy", 10, 100);
        System.out.println(studentIT.toString());

        StudentMechanical studentMechanical = new StudentMechanical("AutoCAD", "2", "Huy", 10, 100);
        System.out.println(studentMechanical.toString());
    }
}
