package com.stackroute.unittest.pe1;

import java.util.ArrayList;
import java.util.Collection;

public class UpdateArray {
    public static ArrayList<String> update(ArrayList<String>list,int i,String str)
    {
        list.remove(i);
        list.add(i,str);
        return list;
    }
    public static ArrayList<String> remove(ArrayList<String> list)
    {
        list.removeAll(list);
        return list;
    }

}