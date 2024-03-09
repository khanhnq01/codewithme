package org.example.Java.ManageStaff;

import java.util.ArrayList;

public class StaffView {
    public static void main(String[] args) {
        StaffModel staff = new StaffModel("ST001", "Nguyen Van A", 5, 25);
        StaffModel staff1 = new StaffModel("ST002", "Nguyen Van B", 6, 26);
        StaffModel staff2 = new StaffModel("ST003", "Nguyen Van C", 7, 27);
        ArrayList<StaffModel> staffList = new ArrayList<>();
        staffList.add(staff1);
        staffList.add(staff2);
        staffList.add(staff);
        double sum = 0.0;
        System.out.println(staff.getTotalSalary());

        for (StaffModel staffModel : staffList) {
            sum += staffModel.getTotalSalary();
        }
        System.out.println(sum);
    }
}
