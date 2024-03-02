package org.example.Java.Polymorphism;

public class Test {
    public static void main(String[] args) {
        Student student1 = new StudentIT(10, 7);
        Student student2 = new StudentMaintenance(8, 10);
        System.out.println("Student 1: " + student1.toString());
        System.out.println("Student 2: " + student2.toString());
    }

}
