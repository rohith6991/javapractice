package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeQ1Test {

    @Test
    public void palindromeCheck() {

       // PalindromeQ1 palindrome = new PalindromeQ1();
       // String result1 = palindrome.PalindromeCheck("2468642");
       // assertEquals("2468642 is palindrome and and the sum of even numbers is greater than 25",result1);

        PalindromeQ1 palindrome = new PalindromeQ1();
        String result = palindrome.palindromeCheck("2468982");
        assertEquals("2468982 is not palindrome",result);

    }

    @Test
    public void palindromeCheck1() {

        PalindromeQ1 palindrome = new PalindromeQ1();
        String result1 = palindrome.palindromeCheck("2468642");
        assertEquals("2468642 is palindrome and and the sum of even numbers is greater than 25",result1);


    }




}