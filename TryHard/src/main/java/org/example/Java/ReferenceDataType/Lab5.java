package org.example.Java.ReferenceDataType;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        int sum = 0;
        System.out.print("Enter a number: ");
        while (true){
            Double number = scanner.nextDouble();
            list.add(number);
            System.out.print("If you want to check sum pls enter (N/n), else press any key to continue:");
            sum += number;
            if (scanner.next().toUpperCase().equalsIgnoreCase("N")){
                break;
            }
            System.out.print("Enter a number: ");
        }
//        for (Double number : list){
//            sum += number;
//        }
        System.out.println("Sum: " + sum);
}
}
