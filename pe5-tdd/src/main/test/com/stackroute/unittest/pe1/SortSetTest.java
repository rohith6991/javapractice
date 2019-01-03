package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
    public void sortSet() {
        HashSet<String> set=new HashSet<String>();
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        set.add("Harry");
        set.add("Olive");

        ArrayList<String> arr=new ArrayList<String>(Arrays.asList(new String[]{"Alice", "Bluto", "Eugene","Harry","Olive"}));
//        arr.add("Alice");
        assertEquals("sorting failed",arr,obj.sort_set(set));
    }

    @Test
    public void sortSet1() {
        HashSet<String> set=new HashSet<String>();
        set.add("Harry");
        set.add("Olive");
        set.add("Alice");
        set.add("Carner");
        set.add("Bluto");


        ArrayList<String> arr=new ArrayList<String>(Arrays.asList(new String[]{"Alice", "Bluto", "Carner","Harry","Olive"}));

        assertEquals("sorting failed",arr,obj.sort_set(set));
    }
    @Test
    public void sortSet2() {
        HashSet<String> set=new HashSet<String>();
        set.add("Alice");


        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Alice");

        assertEquals("single element sort failed",arr,obj.sort_set(set));
    }
    @Test
    public void sortSet3() {
        HashSet<String> set=new HashSet<String>();

        ArrayList<String> arr=new ArrayList<String>();

        assertEquals("input array null case failed",arr,obj.sort_set(set));
    }

    @Test
    public void sortFailure() {
        HashSet<String> set=new HashSet<String>();
        set.add("Harry");
        set.add("Olive");
        set.add("Alice");
        set.add("Carner");
        set.add("Bluto");


        ArrayList<String> arr=new ArrayList<String>(Arrays.asList(new String[]{"Alice", "Bluto", "Carner","Harry","null"}));

        assertNotEquals("sorting failed",arr,obj.sort_set(set));
    }
}
