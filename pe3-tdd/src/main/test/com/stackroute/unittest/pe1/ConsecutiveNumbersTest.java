package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {

    @Test
    public void test1(){

        ConsecutiveNumbers a=new ConsecutiveNumbers();
        String result = a.consecutive("21,22,23");
        assertEquals("21,22,23 are consecutive numbers",result.trim());
    }

    @Test
    public void test2(){

        ConsecutiveNumbers a=new ConsecutiveNumbers();
        String result = a.consecutive("21,22,22");
        assertEquals("21,22,22 non consecutive numbers",result.trim());
    }

    @Test
    public void test3(){

        ConsecutiveNumbers a=new ConsecutiveNumbers();
        String result = a.consecutive("25,24,23");
        assertEquals("25,24,23 are consecutive numbers",result.trim());
    }

}