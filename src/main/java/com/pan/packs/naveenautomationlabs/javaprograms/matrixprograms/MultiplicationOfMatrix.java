package com.pan.packs.naveenautomationlabs.javaprograms.matrixprograms;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationOfMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows for First Matrix");
        int rowsInFirst = sc.nextInt();
        System.out.println("Enter Number of columns For First Matrix or rows for Second Matrix");
        int colsInFirstAndRowsInSecond = sc.nextInt();
        System.out.println("Enter Number of columns For Second Matrix");
        int colsInSecond = sc.nextInt();

        int[][] matrix1 = new int[rowsInFirst][colsInFirstAndRowsInSecond];
        int[][] matrix2 = new int[colsInFirstAndRowsInSecond][colsInSecond];
        int[][] product = new int[rowsInFirst][colsInSecond];

        System.out.println("Enter The data for Matrix1");
        for(int i=0; i<rowsInFirst; i++) {
            for(int j=0; j<colsInFirstAndRowsInSecond; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter The data for Matrix2");
        for(int i=0; i<colsInFirstAndRowsInSecond; i++) {
            for(int j=0; j<colsInSecond; j++) {
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


        for(int i=0; i<rowsInFirst; i++) {
            for(int j=0; j<colsInSecond; j++) {
                for(int k=0; k<colsInFirstAndRowsInSecond; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Product of Both Matrices");
        for(int[] r: product) {
            System.out.println(Arrays.toString(r));
        }
    }
}
