import java.util.Scanner;

public class MatrixAddition {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows of matrix:");
        int m = sc.nextInt();
        System.out.println("Input number of columns of matrix:");
        int n = sc.nextInt();
        int arr1[][] = new int[m][n];
        int arr2[][] = new int[m][n];
        int arr3[][] = new int[m][n];

        System.out.println("Input elements of first matrix:");
        for (int i=0; i< m; i++){
            for(int j=0; j<n; j++)
            {
                int temp= sc.nextInt();
                arr1[i][j]= temp;

            }
        }


        System.out.println("Input elements of second matrix:");
        for (int i=0; i< m; i++){
            for(int j=0; j<n; j++)
            {
                int temp= sc.nextInt();
                arr2[i][j]= temp;

            }
        }


        for (int i=0; i< m; i++){
            for(int j=0; j<n; j++)
            {
                arr3[i][j]= arr2[i][j] + arr1[i][j];

            }
        }

        System.out.println("Elements of addition matrix:");
        for (int i=0; i< m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(arr3[i][j]+" ");

            }
        }

    }
}
