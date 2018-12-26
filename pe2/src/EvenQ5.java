import java.util.Scanner;


class EvenNumTest
{
    //Boolean method to check if its even
    public static boolean isEven(int number)
    {
        if(number % 2 == 0)
            return true;
        else
            return false;
    }
}

//Public main class
public class EvenQ5 {
    //Public main method
    public static void main(String args[])
    {
        EvenNumTest Number = new EvenNumTest(); //Creating an instance of the Even num test class
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an Integer Number");
        int num = sc.nextInt();

        if(Number.isEven(num))
        {
            System.out.println("Given Number is even");
        }
        else
        {
            System.out.println("Given Number is not even");
        }
    }
}