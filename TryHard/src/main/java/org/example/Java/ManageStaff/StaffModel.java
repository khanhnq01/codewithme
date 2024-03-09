package org.example.Java.ManageStaff;

public class StaffModel {
    private String staffID;
    private String staffName;
    private double baseSalary;
    private double totalSalary;
    private int workDay;

    public StaffModel(String staffID, String staffName, double baseSalary, int workDay) {
        this.staffID = staffID;
        this.staffName = staffName;
        this.baseSalary = baseSalary;
        this.workDay = workDay;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (getBaseSalary() < 5) baseSalary = this.baseSalary + this.baseSalary *0.1;
        this.baseSalary = baseSalary;
    }
    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }
    public double getTotalSalary() {
        this.totalSalary = this.baseSalary + this.workDay * 0.18;
        return this.totalSalary;
    }
    public void findStaffByID(String staffID) {
        if (staffID.equals(this.staffID)) {
            System.out.println("Staff ID: " + this.staffID);
            System.out.println("Staff Name: " + this.staffName);
            System.out.println("Base Salary: " + this.baseSalary);
            System.out.println("Work Day: " + this.workDay);
            System.out.println("Total Salary: " + this.totalSalary);
        }
    }
}
