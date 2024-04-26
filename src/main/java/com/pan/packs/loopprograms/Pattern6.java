package com.pan.packs.loopprograms;

//     *
//   ***
// *****
//   ***
//     *
public class Pattern6 {

    public static void main(String[] args) {

       for(int i=0; i<5; i=i+2) {
           for(int j=5; j>i; j--) {
               System.out.print(" ");
           }
           for(int k=0; k<=i; k++) {
               System.out.print("*");
           }
           System.out.println();
       }

        for(int i=3; i<=5; i=i+2) {
            for(int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for(int k=5; k>=i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
