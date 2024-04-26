package com.pan.packs.edabit.arrayprograms;

//Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in
// the array. Otherwise, return "there is no 7 in the array".
public class SevenBoom {

    public static void main(String[] args) {
        int[] inputArray = {6, 23, 42734, 28, 80};

        if(checkForBoom(inputArray))
            System.out.println("Boom!");
        else
            System.out.println("there is no 7 in the array");
    }

    static boolean checkForBoom(int[] arr) {

        boolean flag= false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 7) {
                flag = true;
            } else {
                int temp;
                while (arr[i] != 0) {
                    temp = arr[i] % 10;
                    if (temp == 7) {
                        flag = true;
                        break;
                    } else {
                        arr[i] = arr[i] / 10;
                    }
                }
            }
        }
        return flag;
    }
}
