package com.stackroute.unittest.pe1;

public class ReplaceLetter {

    public static void main(String[] args)
    {
        String str = "dflt";

        // Replace all the 'd' characters with 'f' characters.
        replace(str);


        // Display the strings for comparison.
        System.out.println("Original string: " + str);
        System.out.println("New String: " + replace(str));
    }


    public static String replace(String str){

        String new_str = str.replace('d', 'f').replace('l', 't');

        return new_str;


    }
}