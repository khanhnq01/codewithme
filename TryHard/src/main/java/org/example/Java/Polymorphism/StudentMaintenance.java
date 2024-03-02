package org.example.Java.Polymorphism;

public class StudentMaintenance extends Student{
    private double CNC;
    private double PHL;

    public StudentMaintenance(double CNC, double PHL) {
        this.CNC = CNC;
        this.PHL = PHL;
    }

    public double getCNC() {
        return CNC;
    }

    public void setCNC(double CNC) {
        this.CNC = CNC;
    }

    public double getPHL() {
        return PHL;
    }

    public void setPHL(double PHL) {
        this.PHL = PHL;
    }

    @Override
    double getScore() {
        return ((this.CNC + this.PHL) / 2);
    }

    @Override
    public String toString() {
        return "StudentMaintenance{" +
                "CNC=" + CNC +
                ", PHL=" + PHL +
                '}' + " Score: " + getScore();
    }
}
