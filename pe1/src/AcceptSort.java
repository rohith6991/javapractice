/*
7. Write a program which accepts a number as input from user and perform the following:
a. sort the number in non-increasing order
b. after sorting sum all the even numbers, the sum should be greater than 15 .
c. if sum is more than 15,then print output as true or false.
 */

import java.util.*;
public class AcceptSort
{
    public static void main(String[] args) {
        System.out.println("Enter a Input");
        String number, str2="";
        Scanner sc = new Scanner(System.in);
        number = sc.next();
        System.out.println("The given Number is \n "+number);
        char tempArray[] = number.toCharArray();  // convert input string to char array
        Arrays.sort(tempArray);  // sort tempArray
        System.out.println(tempArray);
        //To loop through the given input string and reverse
        for (int i=tempArray.length-1; i>=0; i--)
        {
            //Appending the characters to Reverse_String
            str2 += tempArray[i];
        }
        System.out.println("The number in Descending order is \n"+ str2);
    }
}

