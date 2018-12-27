package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstLastDateTest {

    @Test
    public void test1() {
        FirstLastDate a = new FirstLastDate();
        String result = a.firstLastDate();
        assertEquals("Mon 24/12/2018 Sun 30/12/2018",result);
    }


}