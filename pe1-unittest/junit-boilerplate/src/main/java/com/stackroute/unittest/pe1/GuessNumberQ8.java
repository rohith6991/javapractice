package com.stackroute.unittest.pe1;

import java.util.Scanner;
public class GuessNumberQ8{

    public static void main(String args[]) {

        int rightguess = 17;
        Scanner sc = new Scanner(System.in);
        int number;
        do{ System.out.println("Enter your guess:");
            number = sc.nextInt();
            System.out.println(guess(number));

        }//condition to check if the number is same as the original number to stop loop and exit
        while (number != rightguess);



    }

    public static String guess(int number){
        String s1="";
        int rightguess = 17;
            //To check if the number is greater than original number
            if(number>rightguess)
            {
                //System.out.println("Guessed Number is more than Original Number");
                s1="Guessed Number is more than Original Number";
            }
            //condition to check if the number is lesser than the original number
            else if(number<rightguess)
            {
                //System.out.println("Guessed Number is leser than than the Original Number");
                s1="Guessed Number is leser than than the Original Number";
            }
            else if(number==rightguess){
                //System.out.println("Guessed Number matches the Original Number..!!!");
                s1="Guessed Number matches the Original Number..!!!";
            }
        return s1;
        }//condition to check if the number is same as the original number to stop loop and exit





}