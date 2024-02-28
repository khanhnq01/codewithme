package org.example.Java.Basic;

import java.util.Scanner;

public class UnitFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chon chuc nang: ");
        System.out.println("1. Tinh phuong trinh bac 1");
        System.out.println("2. Tinh phuong trinh bac 2");
        System.out.println("3. Tinh tien dien");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                PhuongTrinhBacMot();
                break;
            case 2:
                PhuongTrinhBacHai();
                break;
            case 3:
                TinhTienDien();
                break;
            default:
                System.out.println("Chuc nang khong ton tai");
                System.exit(0);
        }
    }

    public static void PhuongTrinhBacMot(){
        //Tinh phuong trinh bac 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap lan luot a, b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == 0){
            if (b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Phuong trinh co nghiem duy nhat: " + (double) -b/a);
        }
    }
    public static void PhuongTrinhBacHai(){
        //Tinh phuong trinh bac 2
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Nhap lan luot a, b, c: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        double delta = b * b - 4 * a * c;
        if (delta < 0){
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0){
            System.out.println("Phuong trinh co nghiem kep: " + (double) -b/(2*a));
        } else {
            System.out.println("Phuong trinh co 2 nghiem phan biet: ");
            System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
        }
    }
    public static void TinhTienDien(){
        //Tinh tien dien
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dien tieu thu: ");
        int soDien = scanner.nextInt();
        if (soDien < 50){
            System.out.println("So tien dien phai tra la: " + soDien * 1000);
        } else {
            System.out.println("So tien dien phai tra la: " + (50 * 1000 + (soDien - 50) * 1200));
        }
    }
}
