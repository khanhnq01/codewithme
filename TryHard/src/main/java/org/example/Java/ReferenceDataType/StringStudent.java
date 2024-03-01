package org.example.Java.ReferenceDataType;

import java.util.ArrayList;
import java.util.Scanner;

public class StringStudent {
    private String name;
    private int id;

    public StringStudent(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName(StringStudent student){
        String name = student.name.substring(0, student.name.indexOf(" ")).toUpperCase();
        return name;
    }

    @Override
    public String toString() {
        return "List Search{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<StringStudent> list = addStudent();
        System.out.println("Enter name to search: ");
        String checkName = scan.nextLine();
        for (StringStudent student : list){
            if (student.getName(student).equalsIgnoreCase(checkName)){
                System.out.println(student.toString());
            }
        }
    }

    private static ArrayList<StringStudent> addStudent() {
        StringStudent student1 = new StringStudent("Nguyen Khanh", 1);
        StringStudent student2 = new StringStudent("Nguyen Tong", 2);
        StringStudent student3 = new StringStudent("Khanh Dang", 3);
        StringStudent student4 = new StringStudent("Ai Van", 4);
        StringStudent student5 = new StringStudent("Phuoc Nguyen", 5);

        ArrayList<StringStudent> list = new ArrayList<StringStudent>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        return list;
    }
}
