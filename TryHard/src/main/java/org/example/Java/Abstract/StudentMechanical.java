package org.example.Java.Abstract;

public class StudentMechanical extends Student{
    private String skills;
    protected double CNC;
    protected double PLC;

    public StudentMechanical(String skills,String id, String name, double tax, double fee, double CNC, double PLC) {
        super(id, name, tax, fee);
        this.skills = skills;
        this.CNC = CNC;
        this.PLC = PLC;
    }

    @Override
    void calculateTax() {
    }

    @Override
    void calculateScore() {
        System.out.println("Score for Mechanical student is: " + ((this.CNC + this.PLC)/2));
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
