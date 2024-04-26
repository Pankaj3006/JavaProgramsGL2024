package com.pan.packs.edabit;

public class NumberedCards {

    public static void main(String[] args) {
        int[] a = {2, 5, 2, 6, 9};
        int[] b = {3, 7, 3, 1, 2};
        System.out.println(winRound(a, b));
    }
    public static boolean winRound(int[] you, int[] opp) {

       boolean flag;
        if(sortArray(you)[0] *10+sortArray(you)[1] > sortArray(opp)[0] *10+sortArray(opp)[1])
            flag = true;
        else
            flag = false;

        return flag;
    }

    private static int[] sortArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j< arr.length; j++) {
                int temp;
                if(arr[j]>arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
