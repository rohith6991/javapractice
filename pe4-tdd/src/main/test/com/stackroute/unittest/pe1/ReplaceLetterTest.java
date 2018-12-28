package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceLetterTest {

    @Test
    public void test1() {
        ReplaceLetter obj = new ReplaceLetter();
        String result = obj.replace("dflt");
        assertEquals("fftt",result);
    }


}