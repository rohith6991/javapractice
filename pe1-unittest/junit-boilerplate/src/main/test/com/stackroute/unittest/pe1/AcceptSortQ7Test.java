package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AcceptSortQ7Test {



    @Test
    public void test2(){

        AcceptSortQ7 obj = new AcceptSortQ7();
        String result = obj.acceptSort("54637365");
        assertEquals("76655433",result);

    }

}