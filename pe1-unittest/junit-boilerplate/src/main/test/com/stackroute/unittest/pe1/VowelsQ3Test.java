package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsQ3Test {


    @Test
    public void test1(){
        VowelsQ3 obj = new VowelsQ3();
        String result = obj.vowelCheck("roh");
        assertEquals("r-CONSONANT o-VOWEL h-CONSONANT ",result);
    }

    @Test
    public void test2(){
        VowelsQ3 obj = new VowelsQ3();
        String result = obj.vowelCheck("ap");
        assertEquals("a-VOWEL p-CONSONANT ",result);
    }

    @Test
    public void test3(){
        VowelsQ3 obj = new VowelsQ3();
        String result = obj.vowelCheck("0");
        assertEquals("ERROR,!Please input letters",result);
    }

}