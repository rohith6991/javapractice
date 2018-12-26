/*
2. Write a program which accepts an integer number as input from the user and perform the following conditional checks:
a. Print Tom if number is odd and exists between 20 to 30
b. Print Jerry, if number is even and exists between 20 and 30
*/
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int i = scan.nextInt();

        if ((i >= 20 && i <30)) {
            if (i % 2 == 0) {
                System.out.println("Jerry");
            } else {
                System.out.println("Tom");
            }

        }
    }
}
