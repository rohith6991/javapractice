package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringQ9Test {

    @Test
    public void test1(){
        ReverseStringQ9 obj = new ReverseStringQ9();
        String result = obj.reverse("london");
        assertEquals("nodnol",result);
    }

}