package com.pan.packs.arrayprograms;

public class FindMaximum {

    public static void main(String[] args) {
        int[] num = {7,8,9,10,6};
        
        int maximumNumber = findingMaximum(num);

        System.out.println("maximumNumber = " + maximumNumber);
    }
    
    static int findingMaximum(int[] array) {
        int max = 0;

        for(int i=0; i<array.length; i++) {
            if(array[i]>max) {
                max=array[i];
            }
        }
        return max;
    }
}
