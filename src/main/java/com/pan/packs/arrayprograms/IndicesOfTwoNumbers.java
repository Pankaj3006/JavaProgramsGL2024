package com.pan.packs.arrayprograms;

public class IndicesOfTwoNumbers {

    public static void main(String[] args) {

        int[] num = {7,8,9,10,6};
        int target = 14;

        int[] solution = findIndicesOfNumbers(num, target);
        for(int i=0;i<solution.length; i++) {
            System.out.println(solution[i]);
        }
    }

    private static int[] findIndicesOfNumbers(int[] num, int target) {
        int count =0;
        int[] indices = new int[2];

        for(int i=0; i< num.length; i++) {
            for (int j=i+1; j< num.length; j++) {
                if(num[i]+num[j]==target) {
                    indices[0] = i;
                    indices[1] = j;
                    count++;
                    break;
                }
            }
            if(count == 1) {
                break;
            }
        }
        return indices;
    }
}
