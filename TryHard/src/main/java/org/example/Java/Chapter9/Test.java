package org.example.Java.Chapter9;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("John", "123", 20, 8);
        System.out.println(student.toString());
        student.setGrade();
        System.out.println(student.toString());

        System.out.println("----------------------");

        Person person = new Person("John", "123", 20);
        System.out.println(person.toString());
    }
}
