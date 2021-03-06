package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;

public class MapObjectTest {
    MapObject obj;
    @Before
    public void setUp() throws Exception {
        obj=new MapObject();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void modify() {
        LinkedHashMap<String ,String> hm=new LinkedHashMap<String, String>();
        hm.put("val1","java");
        hm.put("val2","c++");
        HashMap<String ,String>res=new HashMap<String, String>();
        res.put("val1"," ");
        res.put("val2","java");

        assertEquals("modify failed",res,obj.modify(hm));
    }
    @Test
    public void modify1() {
        LinkedHashMap<String ,String> hm=new LinkedHashMap<String, String>();
        hm.put("val1","abc");
        hm.put("val2","xyz");
        HashMap<String ,String>res=new HashMap<String, String>();
        res.put("val1"," ");
        res.put("val2","abc");

        assertEquals("modify failed",res,obj.modify(hm));
    }
    @Test
    public void modifyFailure() {
        LinkedHashMap<String ,String> hm=new LinkedHashMap<String, String>();
        hm.put("val1","apple");
        hm.put("val2","carrots");


        assertNotNull("Null",obj.modify(hm));
    }
}