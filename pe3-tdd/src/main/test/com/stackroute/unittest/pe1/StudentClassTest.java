package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentClassTest {

    @Test
    public void test1() {

        StudentClass student1 = new StudentClass();
        String result = student1.StudentGrade();
        assertEquals("Error:invalid grade input",result);

    }

}