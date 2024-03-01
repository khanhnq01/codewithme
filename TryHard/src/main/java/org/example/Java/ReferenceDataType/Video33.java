package org.example.Java.ReferenceDataType;

import org.example.Java.OOP.Student;

import java.util.ArrayList;

public class Video33 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Student> list2 = new ArrayList<Student>();
        list.add("Khanh");
        list.add("IT Khanh");
        list.add("Khanh IT");
        list2.add(new Student(20, "Khanh"));
        System.out.println(list2.get(0).getName());
        System.out.println(list.toString());

        System.out.println("------------------");
    }
}
