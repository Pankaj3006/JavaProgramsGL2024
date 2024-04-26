package com.pan.packs.edabit.arrayprograms;

public class LargestGap {

    public static void main(String[] args) {
        int[] inputArray = {9, 4, 26, 26, 0, 0, 5, 22, 6, 25, 5};
        int diff =0;

        int[] sortedArray = returnSortedArray(inputArray);
        for(int i=1; i<sortedArray.length; i++) {
            System.out.print(sortedArray[i]+ " ");
            if((sortedArray[i]-sortedArray[i-1])>diff) {
                diff = sortedArray[i]-sortedArray[i-1];
            }
        }
        System.out.println("diff = " + diff);

    }

    static int[] returnSortedArray(int[] arr) {
        int temp = 0;

        for(int i=0; i< arr.length; i++) {
            for( int j=i+1; j< arr.length; j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
