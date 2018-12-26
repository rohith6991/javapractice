package com.stackroute.unittest.pe1;
import java.util.Scanner;
public class PalindromeQ1 {

    public static void main(String[] args) {
        // write your code here

     //String result =  palindromeCheck();
     //System.out.println(result);


    }


    public static String palindromeCheck(String s){


        //Scanner scan = new Scanner(System.in);
        //System.out.println("Enter the number:");
        //String s = scan.nextLine();
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
        String s1=null;
        int x=0;
        int y=l-1;
        for (x=0; x<(l/2); x++){

            if (n[x]==n[y]){
                y--;
                continue;
            }else {
                //System.out.println(s+" is not palindrome");
                s1=s+" is not palindrome";
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
                s1=s+" is palindrome and and the sum of even numbers is greater than 25";
               // System.out.println(s1);
               // return s1;
            }
            else{
                s1=s+" is palindrome and and the sum of even numbers is less than 25";
               // System.out.println(s1);
                //return s1;
            }

        }
        return s1;
    }






}
