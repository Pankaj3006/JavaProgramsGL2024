package com.pan.packs.naveenautomationlabs.javaprograms.matrixprograms;

import java.util.Arrays;
import java.util.Scanner;

public class PrintMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter Number of columns");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // 1st Way
        for(int[] r: matrix) {
            System.out.println(Arrays.toString(r));
        }

        // 2nd Way
        System.out.println(Arrays.deepToString(matrix));

        // 3rd Way
        for(int[] row: matrix) {
            for(int col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
