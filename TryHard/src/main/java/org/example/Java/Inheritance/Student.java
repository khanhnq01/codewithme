package org.example.Java.Inheritance;

public class Student {
    protected String id;
    protected String name;
    protected double tax;
    protected double fee;

    public Student(String id, String name, double tax, double fee) {
        this.id = id;
        this.name = name;
        this.tax = tax;
        this.fee = fee;
    }

    public double calculatePrice(){
        return this.tax / 100 * this.fee;
    }
    public void infor(){
        System.out.println("Running infor method in Student class");
    }
}
