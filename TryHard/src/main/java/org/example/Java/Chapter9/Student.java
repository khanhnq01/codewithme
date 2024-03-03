package org.example.Java.Chapter9;

public class Student extends Person{
    private int mark;
    private String grade;


    public Student(String name, String id, int age, int mark) {
        super(name, id, age);
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade() {
        if (this.mark >= 8) this.grade = "A";
        if (this.mark >= 7 && this.mark < 8) this.grade = "B";
        if (this.mark >= 5 && this.mark < 7) this.grade = "C";
        if (this.mark < 5) this.grade = "D";
    }

    @Override
    public String toString() {
        return "Student{" +
                "mark=" + mark +
                ", grade='" + grade + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
