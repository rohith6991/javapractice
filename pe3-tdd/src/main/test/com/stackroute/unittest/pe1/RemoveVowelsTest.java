package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    @Test
    public void test1() {
        RemoveVowels a = new RemoveVowels();
        String result = a.removeVowels("rohith");
        assertEquals("rhth",result);
    }

    @Test
    public void test2() {
        RemoveVowels a = new RemoveVowels();
        String result = a.removeVowels("apple");
        assertEquals("ppl",result);
    }

    @Test
    public void test3() {
        RemoveVowels a = new RemoveVowels();
        String result = a.removeVowels("aeiouiluo");
        assertEquals("l",result);
    }

}