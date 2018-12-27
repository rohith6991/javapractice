import java.util.Scanner;

public class StudentClass {

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of students:");
            int numOfStudents = sc.nextInt();
            int arr[] = new int[numOfStudents];
            System.out.println("Enter the grades of students:");

            for (int i=0; i< numOfStudents ; i++)
            {
                int temp= sc.nextInt();
                if (temp >= 0 && temp <=100)
                    {
                        arr[i]=temp;
                    }
                else
                    {
                    System.out.println("Error:invalid grade input");
                    }
            }

            for (int i=0; i< numOfStudents; i++)
            {
                System.out.println(arr[i]);
            }
        }

}
