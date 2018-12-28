package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurencesTest {

    @Test
    public void test1() {
        CountOccurences obj = new CountOccurences();
        int result = obj.countOccurrences("Java is java again java again",'a');
        assertEquals(10,result);
    }
}