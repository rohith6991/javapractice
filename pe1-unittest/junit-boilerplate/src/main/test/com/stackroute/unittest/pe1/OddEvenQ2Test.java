package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenQ2Test {

    @Test
    public void oddEvenCheck() {

        OddEvenQ2 palindrome = new OddEvenQ2();
        String result = palindrome.oddEven(22);
        assertEquals("Jerry",result);


    }

    @Test
    public void oddEvenCheck1() {

        OddEvenQ2 palindrome = new OddEvenQ2();
        String result = palindrome.oddEven(23);
        assertEquals("Tom",result);


    }

}

