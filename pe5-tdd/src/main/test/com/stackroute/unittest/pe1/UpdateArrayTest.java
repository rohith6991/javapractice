package com.stackroute.unittest.pe1;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UpdateArrayTest {
    UpdateArray obj;

    @org.junit.Before
    public void setUp() throws Exception {
        obj=new UpdateArray();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        obj=null;
    }

    @org.junit.Test
    public void update() {
        ArrayList<String> list=new ArrayList<String >();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        list.add("orange");
        ArrayList<String>list1=new ArrayList<String>();
        list1.add("Apple");
        list1.add("Grape");
        list1.add("kiwi");
        list1.add("Berry");
        list1.add("orange");
        assertEquals("updating list failed",list1,obj.update(list,2,"kiwi"));




    }
    @org.junit.Test
    public void update1() {
        ArrayList<String> list=new ArrayList<String >();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        list.add("orange");
        ArrayList<String>list1=new ArrayList<String>();
        list1.add("Apple");
        list1.add("Grape");
        list1.add("Melon");
        list1.add("kiwi");
        list1.add("orange");
        assertEquals("updating list failed",list1,obj.update(list,3,"kiwi"));


    }
    @org.junit.Test
    public void update2() {
        ArrayList<String> list=new ArrayList<String >();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        list.add("orange");
        ArrayList<String>list1=new ArrayList<String>();
        list1.add("kiwi");
        list1.add("Grape");
        list1.add("Melon");
        list1.add("Berry");
        list1.add("orange");
        assertEquals("updating list failed",list1,obj.update(list,0,"kiwi"));


    }



    @org.junit.Test
    public void remove() {

        ArrayList<String> list=new ArrayList<String >();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        list.add("orange");
        ArrayList<String>list1=new ArrayList<String >();
        assertEquals("removing elements from list failed",list1,obj.remove(list));

    }

}