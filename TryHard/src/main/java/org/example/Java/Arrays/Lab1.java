package org.example.Java.Arrays;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt();

        if (isPrime(nums)){
            System.out.println(nums + " la so nguyen to");
        } else {
            System.out.println(nums + " khong phai la so nguyen to");
        }
    }

    private static boolean isPrime(int nums) {
        if (nums < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(nums); i++){
            if (nums % i == 0){
                return false;
            }
        }
        return true;
    }
}
