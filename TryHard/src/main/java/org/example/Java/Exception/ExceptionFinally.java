package org.example.Java.Exception;

import java.util.Scanner;

public class ExceptionFinally {
    public static void main(String[] args) throws Exception {
            boolean continueLoop = false;
            if (!continueLoop){
                throw new Exception("This is an exception");
            } else {
                System.out.println("Khanh");
            }
    }
}