package com.pan.packs.naveenautomationlabs.javaprograms.matrixprograms;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter Number of columns");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        System.out.println("Enter The data for Matrix1");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter The data for Matrix2");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Print Matrix1");
        for(int[] r: matrix1) {
            System.out.println(Arrays.toString(r));
        }

        System.out.println("Print Matrix2");
        for(int[] r: matrix2) {
            System.out.println(Arrays.toString(r));
        }

        System.out.println("Addition of Both Matrices");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
