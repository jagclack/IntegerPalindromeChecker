package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testThatGivenNumberIsAPalindrome() {
        Assertions.assertTrue(true, PalindromeChecker.palindromeChecker(121) + " is a palindrome");
    }

    @Test
    public void testThatGivenNumberIsNotAPalindrome() {
        Assertions.assertTrue(true, PalindromeChecker.palindromeChecker(120) + " is not a Palindrome");
    }

    @Test
    public void testThatOneDigitNumberIsAPalindrome() {
        Assertions.assertTrue(true, PalindromeChecker.palindromeChecker(0) + " is a Palindrome");
    }

    @Test
    public void testThatAGivenNegativeNumberIsAPalindrome() {
        Assertions.assertTrue(true, PalindromeChecker.palindromeChecker(-121) + " is a palindrome");
    }

    @Test
    public void testThatAGivenNegativeNumberIsNotAPalindrome() {
        Assertions.assertTrue(true, PalindromeChecker.palindromeChecker(-120) + " is not a Palindrome");
    }

    @Test
    public void testThatPalindromeCheckerIsNotNull() {
        Assertions.assertNotNull(PalindromeChecker.palindromeChecker(0));
    }

}
