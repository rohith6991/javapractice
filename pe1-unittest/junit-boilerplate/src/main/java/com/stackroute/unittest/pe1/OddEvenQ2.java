package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class OddEvenQ2 {
    public static void main(String[] args){
     System.out.println(oddEven(24));

    }





    public static String oddEven(int i){

        //Scanner scan = new Scanner(System.in);
       // System.out.println("Enter the number:");
       // int i = scan.nextInt();
     String s="null";
        if ((i >= 20 && i <30)) {
            if (i % 2 == 0) {
                s="Jerry";
                //System.out.println("Jerry");
            } else {
                s="Tom";
                //System.out.println("Tom");
            }

        }
    return s;
    }
}
