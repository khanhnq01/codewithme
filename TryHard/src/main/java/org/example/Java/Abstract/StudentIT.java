package org.example.Java.Abstract;

public class StudentIT extends Student{
    private String language;
    private double scoreJava;
    private double scoreHTML;
    public StudentIT(String language,String id, String name, double fee, double tax, double scoreJava, double scoreHTML) {
        super(id, name, fee, tax);
        this.language = language;
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }



    @Override
    void calculateTax() {
        System.out.println("Tax for IT student is: " + (this.tax * this.fee));
    }

    @Override
    void calculateScore() {
        System.out.println("Score for IT student is: " + ((this.scoreJava * 2+ this.scoreHTML))/3);
    }
}
