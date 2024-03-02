package org.example.Java.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Video35 {
    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE); // Check email
        Matcher matcher = pattern1.matcher("khanhnq@gmail.com");
        System.out.println("Input matches the pattern: " + matcher.matches());
    }
}