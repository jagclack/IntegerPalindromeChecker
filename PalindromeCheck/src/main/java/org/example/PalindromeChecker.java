package org.example;

public class PalindromeChecker {
    public static boolean palindromeChecker(int number) {
        int reversedInteger = 0;
        int remainder;
        int originalInteger = number;

        while (number != 0) {
            remainder = number % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            number = number / 10;
        }

        if (originalInteger == reversedInteger) {
            System.out.println(originalInteger + " is a palindrome.");
            return true;
        } else {
            System.out.println(originalInteger + " is not a palindrome.");
            return false;
        }
    }
}
