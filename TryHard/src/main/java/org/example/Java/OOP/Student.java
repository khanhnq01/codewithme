package org.example.Java.OOP;

public class Student {
    private int age;
    private String name;

    public Student(int age, String name){
        if (age < 0 || age > 100){
            this.age = 0;
            throw new IllegalArgumentException("Invalid age");
        } else {
            this.age = age;
        }
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

}
