package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class BooleanMapTest {
    BooleanMap obj;
    @Before
    public void setUp() throws Exception {
        obj=new BooleanMap();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void arr_map() {
        String  arr[] = {"a","b","c","d","a","c","c"};
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        assertEquals("Error",map,obj.arr_map(arr));
    }
    @Test
    public void arr_map1() {
        String  arr[] = {"a","b","c","e","a","c","c","d"};
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        map.put("e",false);
        assertEquals("Error",map,obj.arr_map(arr));
    }
    @Test
    public void arr_map2() {
        String  arr[] = {"a","a","a","b","b","b","b","b","c"};
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        map.put("a",true);
        map.put("b",true);
        map.put("c",false);

        assertEquals("Error",map,obj.arr_map(arr));
    }
    @Test
    public void arr_mapFailure() {
        String  arr[] = {"a","a","a","b","b","b","b","b","c"};
        assertNotNull("Error",obj.arr_map(arr));
    }
}