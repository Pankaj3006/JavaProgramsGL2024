package com.pan.packs.naveenautomationlabs.javaprograms.matrixprograms;

public class SumOfPredefinedMatrix {

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2}, {3,4}};
        //int[][] matrix2 = {{5,6, 9}, {7,8, 12}};
        int[][] matrix2 = {{5,6}, {7,8}};
        int[][] sum = new int[matrix1.length][matrix1[0].length];

        if(matrix1.length != matrix2.length) {
            System.out.println("Matrix addition is not possible");
        }
        else if(matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrix addition is not possible");
        }
        else {
            System.out.println("Addition of Both Matrices");
            for(int i=0; i<matrix1.length; i++) {
                for(int j=0; j<matrix1[i].length; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
