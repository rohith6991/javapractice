package com.stackroute.unittest.pe1;

import java.util.*;
public class LoopQ4 {

//    public static void main(String args[]){
//
//        loop(5);
//
//    }

    public String loop(int num){
        int i,j;
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a number:\n");
        //num = sc.nextInt();
        //To loop through the given input
        StringBuilder result=new StringBuilder();

        for(i=1; i<=num; i++)
        {
            j = i;
            while(j != 0)
            {
                result.append(i+" ");
                j--;
            }
        }
        return result.toString();
    }




}