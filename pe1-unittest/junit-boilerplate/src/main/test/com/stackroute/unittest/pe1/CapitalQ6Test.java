package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalQ6Test {

    @Test
    public void test1(){

        CapitalQ6 obj = new CapitalQ6();
        String result = obj.checkChar("a");
        assertEquals("Small Letter",result);
    }


    @Test
    public void test2(){

        CapitalQ6 obj = new CapitalQ6();
        String result = obj.checkChar("A");
        assertEquals("Capital Letter",result);
    }


    @Test
    public void test3(){

        CapitalQ6 obj = new CapitalQ6();
        String result = obj.checkChar("9");
        assertEquals("Digit",result);
    }


    @Test
    public void test4(){

        CapitalQ6 obj = new CapitalQ6();
        String result = obj.checkChar("ro");
        assertEquals("The Length of the Character is greater than 1",result);
    }


    @Test
    public void test5(){

        CapitalQ6 obj = new CapitalQ6();
        String result = obj.checkChar("*");
        assertEquals("Special Character",result);

    }

}