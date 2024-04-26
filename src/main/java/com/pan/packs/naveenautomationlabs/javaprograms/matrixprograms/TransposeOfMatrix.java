package com.pan.packs.naveenautomationlabs.javaprograms.matrixprograms;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeOfMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter Number of columns");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] transposeOfMatrix = new int[cols][rows];

        System.out.println("Enter The data for Matrix1");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Print Matrix1");
        for(int[] r: matrix) {
            System.out.println(Arrays.toString(r));
        }

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                transposeOfMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose of Matrix");
        for(int[] r: transposeOfMatrix) {
            System.out.println(Arrays.toString(r));
        }
    }
}
