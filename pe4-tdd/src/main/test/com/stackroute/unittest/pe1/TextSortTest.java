package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TextSortTest {


    @Test
    public void test1() {
        TextSort obj = new TextSort();
        String result = obj.word_sort("Hi, this is rohith.");
        assertEquals("hi, is rohith. this",result);
    }

}