package com.pan.packs.edabit;

public class FivesAndThreesOnly {

    public static void main(String[] args) {
        System.out.println(only5and3(1024));
    }

    public static boolean only5and3(int num) {

        boolean flag = false;
        int count =0;
        for(int i=0; i<=num; i++) {
            for(int j=0; j<=num; j++) {
                if(num==3*i+5*j || num==5*i+3*j) {
                    System.out.println("The value of i is: "+ i);
                    System.out.println("The value of j is: "+ j);
                    flag  = true;
                    count++;
                    break;
                }
            }
            if(count==1) {
                break;
            }
        }

        return flag;
    }
}
