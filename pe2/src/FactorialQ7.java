import java.util.*;

public class FactorialQ7 {
    //Method to find the factorial of a Int for 32 signed int
    static void intFactorial()
    {
        int i = 0;
        int int_var = 1;
        //loop while the variable is greatear than 1
        while(int_var > 0)
        {
            i++;
            System.out.println("The factorial of " + (i-1) + " is : " + int_var);
            int_var = int_var * i;
        }
        System.out.println("The factorial of " + i + " is out of range");
    }
    //Method to find the factorial of a long Int number for 64 signed ling int
    static void longFactorial()
    {
        int i = 0;
        long long_var = 1;
        //loop while the variable is greatear than 1
        while(long_var > 0)
        {
            i++;
            System.out.println("The factorial of " + (i-1) + " is : " + long_var);
            long_var = long_var * i;
        }
        System.out.println("The factorial of " + i + " is out of range");
    }
    //public main method
    public static void main(String args[])
    {
        intFactorial();
        System.out.println();
        longFactorial();
    }
}