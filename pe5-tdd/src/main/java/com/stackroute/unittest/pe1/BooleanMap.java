/*
3. Write a program where an array of strings is input and output is a Map< String ,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
 */

package com.stackroute.unittest.pe1;

import java.util.HashMap;

public class BooleanMap {
    public HashMap<String, Boolean>arr_map(String [] str ) {
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        for(int i=0;i<str.length;i++)
        {
            if(map.get(str[i])==null)
            {
                map.put(str[i],false);
            }
            else
                map.put(str[i],true);


        }
        return map;

    }
}