package org.example.Java.Inheritance;

public class StudentIT extends Student{
    private String language;

    public StudentIT(String language, String id, String name, double tax, double fee) {
        super(id, name, tax, fee);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void getMoney(){
        System.out.println("The fee is: ");
        this.infor();
    }

    @Override
    public void infor() {
        System.out.println("Running info method in StudentIT class");
    }

    @Override
    public String toString() {
        return "StudentIT{" +
                "language='" + this.language + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tax=" + tax +
                ", fee=" + fee +
                '}';
    }
}
