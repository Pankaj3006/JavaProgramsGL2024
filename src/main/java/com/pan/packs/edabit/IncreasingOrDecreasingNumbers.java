package com.pan.packs.edabit;

public class IncreasingOrDecreasingNumbers {

    public static void main(String[] args) {

        System.out.println(incDec(100, 200));
    }

    public static int incDec(int start, int end) {

        int count = 0;
        for(int i=start; i<=end; i++) {
            if(checkForDecreasingNumber(i)) {
                count++;
            }
        }

        return count;
    }

    static boolean checkForDecreasingNumber(int n) {
        boolean flag = false;
        String str = String.valueOf(n);

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i)>str.charAt(i-1)) {
                flag = true;
            }
            else {
                flag = false;
                break;
            }
        }

        return flag;
    }
}
