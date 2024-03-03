package org.example.Java.Exception;

public class Student {
    protected String name;
    protected int id;
    protected double score;
    private int age;

    public Student(String name, int id, double score, int age) {
        this.name = name;
        this.id = id;
        this.score = score;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", id='" + this.id + '\'' +
                ", score=" + this.score +
                ", age=" + this.age +
                '}';
    }
}
