package com.stackroute.unittest.pe1;

import java.util.*;

public class SortSet {
    public ArrayList<String> sort_set(HashSet<String>hash_Set)
    {
        Set<String> tree_Set = new TreeSet<String>(hash_Set);
        Iterator<String> it=tree_Set.iterator();
        ArrayList<String>list1=new ArrayList<String>();
        while(it.hasNext())
        {
            list1.add(it.next());
        }
        return list1;

    }
}