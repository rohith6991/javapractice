package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class StudentClass {

    public static void main(String[] args){

       System.out.println(StudentGrade());
    }

    public static String StudentGrade(){

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the number of students:");
       // int numOfStudents = sc.nextInt();
        int numOfStudents=2;
        int arr[] = new int[]{21,798};
        //System.out.println("Enter the grades of students:");
        String s="";
        for (int i=0; i< arr.length ; i++)
        {

            if (arr[i] >= 0 && arr[i] <=100)
            {
                s="";
            }
            else
            {
                s= "Error:invalid grade input";
            }
        }

        return s;

    }

}
