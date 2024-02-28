package org.example.Java.OOP;

public class ObjectStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 20;
        student.name = "Khanh";

        System.out.println("Hello, " + student.name + ". You are " + student.age + " years old");
    }
}
