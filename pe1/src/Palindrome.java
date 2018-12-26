/*
1. Write a program which accepts a number as input and check whether the given number is palindrome or not If it is a palindrome then
a. Add all the even numbers and check whether the sum is more than 25.
b. Print success and failure messages for all 3 conditions
*/

package com.company;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        String s = scan.nextLine();
        //System.out.println(s);
        int l = s.length();
        //System.out.println(l);
        char[] n = new char[s.length()];
        for (int j = 0; j <= l - 1; j++)
        { char c1 = s.charAt(j);
            n[j] = c1;
        }
        /*for (int i=0; i<= l-1; i++){
            System.out.println(n[i]);
        }*/
        int x=0;
        int y=l-1;
        for (x=0; x<(l/2); x++){

            if (n[x]==n[y]){
                y--;
                continue;
            }else {
                System.out.println(s+" is not palindrome");
                break;
            }
        }



        if (x == ((l/2)) ){

            int sum=0;
            for (int i=0; i<= l-1; i++){
                int z= n[i];

                if (z % 2 == 0) {
                    //System.out.println(n[i]);
                    sum = sum + n[i] - '0';
                    //System.out.println(sum);
                }
            }

            //System.out.println(sum);

            if(sum > 25) {
                System.out.println(s+" is palindrome and and the sum of even numbers is greater than 25");
            }
            else{
                System.out.println(s+" is palindrome and and the sum of even numbers is less than 25");
            }

        }


    }
}
