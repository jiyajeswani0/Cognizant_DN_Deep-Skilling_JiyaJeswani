package com.cognizant.junit;

public class StringUtility {

    // Reversing a string
    public String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    // Checking if a string is palindrome
    public boolean isPalindrome(String text) {
        String reversed = reverse(text);
        return text.equalsIgnoreCase(reversed);
    }

    // Counting no. of characters
    public int countCharacters(String text) {
        return text.length();
    }
}