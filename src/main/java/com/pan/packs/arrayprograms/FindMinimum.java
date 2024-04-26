package com.pan.packs.arrayprograms;

public class FindMinimum {

    public static void main(String[] args) {
        int[] num = {7, 100, 8, 9, 10, 5, 1, 6, 2};

        int minimumNumber = findingMinimum(num);
        System.out.println("minimumNumber = " + minimumNumber);
    }

    static int findingMinimum(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
