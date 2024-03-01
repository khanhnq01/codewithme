package org.example.Java.ReferenceDataType;

import java.util.Scanner;

public class StringDataType {
    public static void main(String[] args) {
        String userNameCheck = "khanhadmin";
        String userName;
        String passWord;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username: ");
        userName = scanner.nextLine();
        System.out.println("Enter your password: ");
        passWord = scanner.nextLine();
        if (userName.equals(userNameCheck) && passWord.length() > 6){
            System.out.println("Login success");
        } else {
            System.out.println("Login failed");
        }
    }
}
