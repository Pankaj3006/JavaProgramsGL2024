package com.pan.packs.edabit;

public class LowestCommonMultiple {

    public static void main(String[] args) {
        System.out.println(lcm(6, 32));
    }

    public static int lcm(int a, int b) {

        int biggerNum = Math.max(a,b);
        int lcm =0;
        for(int i=biggerNum; i<=a*b; i++) {
            if(i%a==0 && i%b==0) {
                lcm = i;
                break;
            }
        }

        return lcm;
    }
}
