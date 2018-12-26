package com.stackroute.unittest.pe1;

import java.util.Scanner;

import java.util.*;
public class RepeatNtimesQ10 {

    public static void main(String[] args){
     System.out.println(repeatString("stackroute",5));
    }

    public static String repeatString(String s,int n){
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Enter the string:");
        //String s = scan.nextLine();
        //System.out.println(s);
        //int n = scan.nextInt();
        //System.out.println(n);

        int l = s.length();

        char[] a = new char[s.length()];
        for (int j = 0; j <= l - 1; j++)
        { char c1 = s.charAt(j);
            a[j] = c1;
        }

        StringBuilder result=new StringBuilder();
        //System.out.print(s);
        result.append(s);
        for (int i=0; i<n; i++){
            for(int k=l-n; k<=l-1 ; k++){
                //System.out.print(a[k]);
                result.append(a[k]);

            }
        }

        return result.toString();
    }
}
