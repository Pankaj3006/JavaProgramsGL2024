package com.pan.packs.naveenautomationlabs.javaprograms.arrayprograms;

//Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in
// the array. Otherwise, return "there is no 7 in the array".
public class SevenBoomChallenge {

    public static void main(String[] args) {
        int[] array = {3, 654, 97, 3, 0, 8945362};

        if(checkForSeven(array))
            System.out.println("Seven Boom!");
        else System.out.println("there is no 7 in the array");
    }

    private static boolean checkForSeven(int[] arr) {
        boolean isSevenPresent = false;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==7) {
                isSevenPresent = true;
            }
            else {
                while(arr[i]>0) {
                    int digit = arr[i]%10;
                    if(digit == 7) {
                        isSevenPresent = true;
                        break;
                    }
                    arr[i] = arr[i]/10;
                }
            }
        }

        return isSevenPresent;
    }
}
