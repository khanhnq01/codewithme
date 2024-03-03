package org.example.Java.Exception;

import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);
    public static int inputId(){
        int result;
        while (true){
            System.out.print("Input ID of student: ");
            try{
                result = scanner.nextInt();
                break;
            }catch (Exception e){
                System.out.println("ID invalid");
                scanner.next();
            }
        }
        return result;
    }
    public static double inputScore(){
        double Score = 0;
        while (true){
            System.out.print("Input Score of student: ");
            try{
                Score = scanner.nextDouble();
                break;
            }catch (Exception e){
                System.out.println("Score invalid");
                scanner.next();
            }
        }
        scanner.close();
        return Score;
    }

    public static void main(String[] args) {
        Student student = new Student("Khanh", inputId(), inputScore(),3);
        System.out.println(student.toString());
    }
}