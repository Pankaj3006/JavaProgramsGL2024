package com.pan.packs.edabit;

public class AnyPrimeNumberInRange {

    public static void main(String[] args) {

        System.out.println(PrimeNumberInRange(3,5));
    }

    public static boolean PrimeNumberInRange(int n1, int n2) {

        int count =0;
        for(int i=n1; i<=n2; i++) {
            if(!checkPrimeNumber(i)) {
                count++;
                break;
            }
        }

        if(count==0)
            return false;
        else
            return true;
    }

    private static boolean checkPrimeNumber(int num) {
        boolean flag = false;

        for(int i=2; i<=num/2; i++) {
            if(num%i==0) {
                flag = true;
                break;
            }
        }

        return flag;
    }
}
