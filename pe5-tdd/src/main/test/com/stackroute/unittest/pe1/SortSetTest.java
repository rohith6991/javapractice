package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.*;

public class SortSetTest {
    SortSet obj;
    @Before
    public void setUp() throws Exception {
        obj=new SortSet();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void sort_set() {
        HashSet<String> set=new HashSet<String>();
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        set.add("Harry");
        set.add("Olive");

        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Alice");
        arr.add("Bluto");
        arr.add("Eugene");
        arr.add("Harry");
        arr.add("Olive");
        assertEquals("Error",arr,obj.sort_set(set));
    }

    @Test
    public void sort_set1() {
        HashSet<String> set=new HashSet<String>();
        set.add("Alice");
        set.add("Carner");
        set.add("Bluto");
        set.add("Harry");
        set.add("Olive");

        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Alice");
        arr.add("Bluto");
        arr.add("Carner");
        arr.add("Harry");
        arr.add("Olive");
        assertEquals("Error",arr,obj.sort_set(set));
    }
    @Test
    public void sort_set3() {
        HashSet<String> set=new HashSet<String>();
        set.add("Alice");
        set.add("Carner");
        set.add("Bluto");
        set.add("Harry");
        set.add("Olive");
        set.add("Keshav");
        set.add("Kumar");

        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Alice");
        arr.add("Bluto");
        arr.add("Carner");
        arr.add("Harry");
        arr.add("Keshav");
        arr.add("Kumar");
        arr.add("Olive");
        assertEquals("Error",arr,obj.sort_set(set));
    }
    @Test
    public void sort_setFailure() {
        HashSet<String> set=new HashSet<String>();
        set.add("Alice");
        set.add("Carner");
        set.add("Bluto");
        set.add("Harry");
        set.add("Olive");
        set.add("Keshav");
        set.add("Kumar");

        assertNotNull("Error",obj.sort_set(set));

    }

}