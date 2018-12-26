/*
9. Write a program to reverse any string without using String Buffer.
 */


import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        String input;
        String Reverse_String = " ";
        Scanner sc =  new Scanner(System.in);
        System.out.println("Input a string\n");
        input = sc.next();
        //To loop through the given input string
        for (int i=input.length()-1; i>=0; i--)
        {
            //Appending the characters to Reverse_String
            Reverse_String += input.charAt(i);
        }
        System.out.println("The Reverse String is \n"+ Reverse_String);
    }
}