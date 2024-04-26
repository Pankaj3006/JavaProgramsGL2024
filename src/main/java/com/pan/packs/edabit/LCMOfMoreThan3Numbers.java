package com.pan.packs.edabit;

public class LCMOfMoreThan3Numbers {

    public static void main(String[] args) {

        int[] arr = {13, 6, 17, 18, 19, 20, 37};
        System.out.println(lcmOfArray(arr));
    }

    public static int lcmOfArray(int[] arr) {

        int start = findLargestNumber(arr);
        int end = calculateMultiplicationOfAllElements(arr);
        int lcm = 0;
        for(int i=start; i<=end; i++) {

            int count =0;
            for(int j=0; j<arr.length; j++) {
                if(i%arr[j]==0) {
                    count++;
                }
                else {
                    break;
                }
            }

            if(count==arr.length) {
                lcm = i;
                break;
            }
        }

        return lcm;
    }

    static int findLargestNumber(int[] array) {
        int max=0;
        for(int i=0; i<array.length; i++) {
          if(array[i]>max)
              max=array[i];
        }

        return max;
    }

    static int calculateMultiplicationOfAllElements(int[] array) {
        int mult=1;
        for(int i=0; i<array.length; i++) {
            mult *= array[i];
        }

        return mult;
    }
}
