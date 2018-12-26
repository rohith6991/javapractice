import java.util.*;

public class StudentQ6 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students : ");
        int numOfStudents =  sc.nextInt();
        //student array to to store the data of the student
        int student[] = new int[numOfStudents];
        int i, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        Double sum = 0.00;
        //to loop through the student and find the min , max adn average
        for(i=0;i<numOfStudents;i++)
        {
            System.out.println("Enter the grade for Student " + (i+1));
            student[i] = sc.nextInt();
            sum = sum + student[i];
            if(student[i] < min)
                min = student[i];
            if(student[i] > max)
                max = student[i];
        }
        Double avg = sum/numOfStudents;
        System.out.println("The average is " + avg);
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);
    }
}