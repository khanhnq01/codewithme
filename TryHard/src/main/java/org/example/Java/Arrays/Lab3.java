package org.example.Java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Chon chuc nang: ");
        System.out.println("1. Sap xep mang tang");
        System.out.println("2. Sap xep mang giam");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                Grow(n);
                break;
            case 2:
                Down(n);
                break;
            default:
                System.out.println("Chuc nang khong ton tai");
                System.exit(0);
        }
    }

    private static void Down(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("Mang sau khi sap xep la: " + Arrays.toString(nums));
    }

    public static void Grow(int n){
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("Mang sau khi sap xep la: " + Arrays.toString(nums));
    }
}
