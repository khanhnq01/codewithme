package org.example.Java.Polymorphism;

public class StudentIT extends Student{
    private double scoreJava;
    private double scoreHTML;

    public StudentIT(double scoreJava, double scoreHTML) {
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }

    public double getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    public double getScoreHTML() {
        return scoreHTML;
    }

    public void setScoreHTML(double scoreHTML) {
        this.scoreHTML = scoreHTML;
    }

    @Override
    double getScore() {
        return (this.scoreJava * 2 + this.scoreHTML) / 3;
    }

    @Override
    public String toString() {
        return "StudentIT{" +
                "scoreJava=" + scoreJava +
                ", scoreHTML=" + scoreHTML +
                '}' + " Score: " + getScore();
    }
}
