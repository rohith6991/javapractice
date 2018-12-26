package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoopQ4Test {

    @Test
    public void test1(){
        LoopQ4 obj = new LoopQ4();
        String result = obj.loop(5);
        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ",result);
    }
    @Test
    public void test2(){
        LoopQ4 obj = new LoopQ4();
        String result = obj.loop(0);
        assertEquals("" ,result);
    }
    @Test
    public void test3(){
        LoopQ4 obj = new LoopQ4();
        String result = obj.loop(-1);
        assertEquals("",result);
    }

}