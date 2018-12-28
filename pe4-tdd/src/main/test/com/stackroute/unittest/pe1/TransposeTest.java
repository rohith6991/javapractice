package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {

    @Test
    public void test1() {
        Transpose obj = new Transpose();
        String result = obj.transpose("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god",result);
    }

}