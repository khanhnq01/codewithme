package org.example.LessonOne;

import java.util.Scanner;

public class UnitTwo {
    public static void main(String[] args) {
        Student();
        HCN();

    }
    public static void Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap ten cua ban: ");
        String name = scanner.nextLine();
        System.out.printf("Nhap diem trung binh: ");
        double diemTrungBinh = scanner.nextDouble();
        System.out.printf("Xin chao, %s.", name);
        System.out.printf("\nDiem trung binh cua ban la: %.1f" ,diemTrungBinh);
    }
    public static void HCN(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhap chieu dai va chieu rong cua hinh chu nhat: ");
        int chieuDai = scanner.nextInt();
        int chieuRong = scanner.nextInt();
        scanner.close();
        System.out.println("Chu vi hinh chu nhat la: " + (chieuDai + chieuRong) * 2);
        System.out.println("Dien tich hinh chu nhat la: " + chieuDai * chieuRong);
        System.out.println("Canh nho nhat cua hinh chu nhat la: " + Math.min(chieuDai, chieuRong));
    }
}
