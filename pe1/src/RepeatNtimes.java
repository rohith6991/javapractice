/*
10. Write a program for the following condition:
Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should repeat n number of times in the output String.
 */


import java.util.*;
public class RepeatNtimes {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = scan.nextLine();
        //System.out.println(s);
        int n = scan.nextInt();
        System.out.println(n);

        int l = s.length();

        char[] a = new char[s.length()];
        for (int j = 0; j <= l - 1; j++)
        { char c1 = s.charAt(j);
            a[j] = c1;
        }


        System.out.print(s);
        for (int i=0; i<n; i++){
            for(int k=l-n; k<=l-1 ; k++){
            System.out.print(a[k]);
            }
        }


    }
}
