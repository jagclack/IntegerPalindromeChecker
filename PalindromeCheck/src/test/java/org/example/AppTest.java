package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    public void testThatGivenNumberIsAPalindrome() {
        Assertions.assertTrue(true, palindromeChecker.palindromeChecker(121) + " is a palindrome");
    }

    @Test
    public void testThatGivenNumberIsNotAPalindrome() {
        Assertions.assertTrue(true, palindromeChecker.palindromeChecker(120) + " is not a Palindrome");
    }

    @Test
    public void testThatOneDigitNumberIsAPalindrome() {
        Assertions.assertTrue(true, palindromeChecker.palindromeChecker(0) + " is a Palindrome");
    }

    @Test
    public void testThatGivenNegativeNumberIsAPalindrome() {
        Assertions.assertTrue(true, palindromeChecker.palindromeChecker(-121) + " is a palindrome");
    }

    @Test
    public void testThatGivenNegativeNumberIsNotAPalindrome() {
        Assertions.assertTrue(true, palindromeChecker.palindromeChecker(-120) + " is not a Palindrome");
    }

    @Test
    public void testThatPalindromeCheckerIsNotNull() {
        Assertions.assertNotNull(palindromeChecker);
    }

}
