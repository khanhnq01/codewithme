package org.example.Java.Inheritance;

public class StudentMechanical extends Student{
    private String skills;

    public StudentMechanical(String skills,String id, String name, double tax, double fee) {
        super(id, name, tax, fee);
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "StudentMechanical{" +
                "skills='" + skills + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tax=" + tax +
                ", fee=" + fee +
                '}';
    }
}
