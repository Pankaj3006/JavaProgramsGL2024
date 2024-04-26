package com.pan.packs.edabit.arrayprograms;

public class NumberedCards {

    public static void main(String[] args) {
        int[] arr1 = {4, 3, 4, 4, 5};
        int[] arr2 = {3, 2, 5, 4, 1};

        System.out.println(winRound(arr1, arr2));
    }

    public static boolean winRound(int[] you, int[] opp) {

        int max_you = 0;
        int max_opp = 0;
        int max_index_you = 0;
        int max_index_opp = 0;

        for(int i=0; i<you.length; i++) {
            if(you[i]>max_you) {
                max_you = you[i];
                max_index_you = i;
            }

            if(opp[i]>max_opp) {
                max_opp = opp[i];
                max_index_opp = i;
            }
        }

        System.out.println("max_you = " + max_you);
        System.out.println("max_opp = " + max_opp);
        System.out.println("max_index_you = " + max_index_you);
        System.out.println("max_index_opp = " + max_index_opp);

        if(max_you > max_opp) return true;
        else if(max_you < max_opp) return false;
        else {
            // finding next (second Highest) element
            max_you = 0;
            max_opp = 0;
            for (int i = 0; i < you.length; i++) {
                if (you[i] > max_you && max_index_you != i) max_you = you[i];
                if (opp[i] > max_opp && max_index_opp != i) max_opp = opp[i];
            }
        }

        return max_you > max_opp;

    }
}
