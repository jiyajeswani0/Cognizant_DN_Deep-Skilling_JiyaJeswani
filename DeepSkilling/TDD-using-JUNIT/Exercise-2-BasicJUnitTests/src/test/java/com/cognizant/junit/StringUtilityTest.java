package com.cognizant.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilityTest {

    StringUtility utility = new StringUtility();

    @Test
    void testReverse() {
        assertEquals("avaJ", utility.reverse("Java"));
    }

    @Test
    void testPalindromeTrue() {
        assertTrue(utility.isPalindrome("madam"));
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(utility.isPalindrome("Java"));
    }

    @Test
    void testCharacterCount() {
        assertEquals(4, utility.countCharacters("Java"));
    }
}