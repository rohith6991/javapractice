package com.stackroute.unittest.pe1;

import java.util.*;
public class VowelsQ3 {

    public static void main(String args[]) {

        System.out.println(vowelCheck("ap"));

    }

    public static String vowelCheck(String word){
        //Scanner sc = new Scanner(System.in);
        //String word = sc.next();
        StringBuilder result=new StringBuilder();
        if (!word.matches("[a-zA-Z]+"))
        {
            //System.out.println("ERROR,!Please input letters");
            result.append("ERROR,!Please input letters");
        }
        else
        {
            //To loop through the sequence of word
            for (int i = 0; i < word.length(); i++)
            {
                //To check if the given Word is having Vowel or Consonant
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
                {
                    //System.out.print(word.charAt(i) + "VOWEL ");
                    result.append(word.charAt(i) + "-VOWEL ");
                }
                else
                {
                    //System.out.print(word.charAt(i) + "CONSONANT ");
                    result.append(word.charAt(i) + "-CONSONANT ");
                }
            }
        }

        return result.toString();
    }

}