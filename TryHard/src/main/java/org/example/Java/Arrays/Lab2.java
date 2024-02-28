package org.example.Java.Arrays;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần in bảng cửu chương: ");
        int n = scanner.nextInt();
        System.out.println("Bảng cửu chương " + n + " là: ");
        for (int i = 1; i<= 10; i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
