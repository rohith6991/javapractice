/*
4. Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6       6 6 . . . nth iteration.
 */


import java.util.*;
public class Loop {
    public static void main(String args[])
    {
        int num,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:\n");
        num = sc.nextInt();
        //To loop through the given input
        for(i=1; i<=num; i++)
        {
            j = i;
            while(j != 0)
            {
                System.out.println(i+" ");
                j--;
            }
        }
    }
}