package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    @Test
    public void test1() {

        MatrixAddition add = new MatrixAddition();
        int[][] result= add.addMatrix();
        int arr4[][] = new int[][]{{10,10,10},{10,10,10}};
        assertArrayEquals(arr4,result);

    }
}