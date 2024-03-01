package org.example.Java.OOP;

public class ObjectStudent {
    public static void main(String[] args) {
        Student student1 = new Student(20, "Khanh");
        Student student2 = new Student(10, "Khang");

        System.out.println("Hello, " + student1.getName() + ". You are " + student1.getAge() + " years old");
        System.out.println("Hello, " + student2.getName() + ". You are " + student2.getAge() + " years old");
    }
}
