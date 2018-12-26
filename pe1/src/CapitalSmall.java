/*
6. Write a program that takes a character from the user as input and determines whether the character entered is a capital letter, a small case letter, a digit or a special symbol and display appropriately.
 */


import java.util.Scanner;
public class CapitalSmall {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a Character of ur Choice");
        String str = sc.next();
        if(str.length() == 1)
        {
            if(str.matches("[A-Z]"))
            {
                System.out.println("Capital Letter");
            }
            else if(str.matches("[a-z]"))
            {
                System.out.println("Small Letter");
            }
            else if(str.matches("[0-9]"))
            {
                System.out.println("Digit");
            }
            else
            {
                System.out.println("Special Character");
            }
        }
        else
        {
            System.out.println("The Length of the Character is greater than 1");
        }
    }
}