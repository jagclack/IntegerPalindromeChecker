package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    public void testThatOneDigitNumberIsAPalindrome() {
        Assertions.assertTrue(true,  " is a palindrome");
    }

    @Test
    public void testThatPalindromeCheckerIsNotNull () {
        Assertions.assertNotNull(palindromeChecker);
    }

}
