package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class RemoveVowels {

    public static void main(String[] args) {

        System.out.println(removeVowels("rohith"));


    }

    public static String removeVowels(String string){


        //System.out.println("Input String : " + string);
        string = string.replaceAll("[AaEeIiOoUu]", "");
        //System.out.print("Place Name without Vowels:");
        return string;

    }

}
