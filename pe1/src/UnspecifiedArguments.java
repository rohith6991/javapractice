/*
5. Write a program that reads an unspecified number of integer arguments using Scanner Class and adds them together. The program should display total of the given input number and should only consider integer value.The program should display an error message if there are any non integer values
Input :  12 23 2 4
Output : 41
 */

//import java.util.*;
//public class UnspecifiedArguments {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the numbers:");
//
//        int number,sum=0;
//
//        while ((number = input.nextInt()) != 0){
//            sum=sum+number;
//        }
//        System.out.println(sum);
//
//
//    }
//
//}

//package com.stackroute.unittest;

import java.util.Scanner;

public class UnspecifiedArguments {

    public static void main(String[] args){
        int sum=0;
        System.out.println("Enter series of numbers");
        Scanner scanLine=new Scanner(System.in);
        String numbers=scanLine.nextLine();
        String[] numArray=numbers.split(" ");

        for(int i=0;i<numArray.length;i++){
            try {
                sum += Integer.parseInt(numArray[i]);
            }
            catch (Exception e){
                System.out.println(numArray[i]+" is not an Integer");
            }
        }
        System.out.println("The sum is "+sum);
    }
}