package com.stackroute.unittest.pe1;

import java.util.Arrays;
import java.util.Scanner;

public class TextSort {
    public static String word_sort(String str)
    {
        str=str.toLowerCase();
        String [] arr =str.split("[ \n]");
        Arrays.sort(arr);
        String res="";
        for(int i=0;i<arr.length;i++)
        {
            res+=arr[i];
            if(i==arr.length-1)
                break;
            res+=" ";
        }
        //System.out.println(res);
        return res;
    }

    public static void main(String [] args)
    {
        // System.out.println("Enter the paragraph text");
        // Scanner in =new Scanner(System.in);
//        String str="You’ve reached the end of your free member preview for this month."+"\n"+
//                "Become a member now for $5/month to read this story and get unlimited access to all of the best stories on Medium.";
        //System.out.println(str);
        //str=str.toLowerCase();
        String str="Hi, this is rohith.";

        String str1=word_sort(str.toLowerCase());
        System.out.println(str1);


    }
}