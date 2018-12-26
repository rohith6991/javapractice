package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatNtimesQ10Test{

    @Test
    public void test1(){
        RepeatNtimesQ10 obj = new RepeatNtimesQ10();
        String result = obj.repeatString("stackroute",5);
        assertEquals("stackrouterouterouterouterouteroute",result);
    }
    @Test
    public void test2(){
        RepeatNtimesQ10 obj = new RepeatNtimesQ10();
        String result = obj.repeatString("stackroute",2);
        assertEquals("stackroutetete",result);
    }

}