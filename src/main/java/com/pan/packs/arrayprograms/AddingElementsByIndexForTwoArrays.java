package com.pan.packs.arrayprograms;

public class AddingElementsByIndexForTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {7,9,3};
        int[] arr2 = {7,6,5};
        int[] arr3 = new int[arr1.length];
        int carry=0;

        for(int i=0; i<arr1.length; i++) {
                if(arr1[i]+arr2[i]+carry<10) {
                    arr3[i] = arr1[i] + arr2[i]+ carry;
                    carry=0;
                } else {
                    arr3[i] = (arr1[i] + arr2[i]+carry)%10;
                    carry =1;
                }
        }

        for(int i=0; i<arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }

}
