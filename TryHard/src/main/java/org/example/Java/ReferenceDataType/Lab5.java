package org.example.Java.ReferenceDataType;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        int sum = 0;
        while (true){
            Double number = scanner.nextDouble();
            list.add(number);
            System.out.println("If you don't want to continue enter (N)");
            sum += number;
            if (scanner.next().toUpperCase().equalsIgnoreCase("N")){
                break;
            }
        }
//        for (Double number : list){
//            sum += number;
//        }
        System.out.println("Sum: " + sum);
}
}
