package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class MatrixAddition {


    public static void main(String[] args){






    }




    public static int[][] addMatrix(){

        int m=2,n=3;
        int arr1[][] = new int[][]{{1,2,3},{4,5,6}};
        int arr2[][] = new int[][]{{9,8,7},{6,5,4}};
        int arr3[][] = new int[m][n];



        for (int i=0; i< m; i++){
            for(int j=0; j<n; j++)
            {
                arr3[i][j]= arr2[i][j] + arr1[i][j];

            }
        }
        return arr3;

    }
}

