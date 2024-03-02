package org.example.Java.Abstract;

public abstract class Student {
    protected String id;
    protected String name;
    protected double fee;
    protected double tax;
    protected double scoreJava;
    protected double scoreHTML;

    abstract void calculateTax();
    abstract void calculateScore();
    public Student(String id, String name, double fee, double tax) {
        this.id = id;
        this.name = name;
        this.fee = fee;
        this.tax = tax;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", fee=" + fee +
                ", tax=" + tax +
                '}';
    }
}
