package com.stackroute.unittest.pe1;

import java.util.Scanner;
public class CapitalQ6 {
    public static void main(String args[]){

        System.out.println(checkChar("a"));

    }


    public static String checkChar(String str){

        //Scanner sc = new Scanner(System.in);
       // System.out.println("Please input a Character of ur Choice");
        //String str = sc.next();
        String s= "null";
        if(str.length() == 1)
        {
            if(str.matches("[A-Z]"))
            {
                //System.out.println("Capital Letter");
                s="Capital Letter";
            }
            else if(str.matches("[a-z]"))
            {
                //System.out.println("Small Letter");
                s="Small Letter";
            }
            else if(str.matches("[0-9]"))
            {
                //System.out.println("Digit");
                s="Digit";
            }
            else
            {
                //System.out.println("Special Character");
                s="Special Character";
            }
        }
        else
        {
            //System.out.println("The Length of the Character is greater than 1");
            s="The Length of the Character is greater than 1";
        }

        return s;



    }
}