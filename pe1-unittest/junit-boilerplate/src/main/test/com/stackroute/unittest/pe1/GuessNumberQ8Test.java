package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberQ8Test {


    @Test
    public void test1(){

        GuessNumberQ8 obj = new GuessNumberQ8();
        String result = obj.guess(17);
        assertEquals("Guessed Number matches the Original Number..!!!",result);

    }
    @Test
    public void test2(){

        GuessNumberQ8 obj = new GuessNumberQ8();
        String result = obj.guess(16);
        assertEquals("Guessed Number is leser than than the Original Number",result);

    }

}