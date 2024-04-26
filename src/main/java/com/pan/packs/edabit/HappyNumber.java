package com.pan.packs.edabit;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(67));
        System.out.println(isHappy(89));
        System.out.println(isHappy(139));
        System.out.println(isHappy(1327));
        System.out.println(isHappy(2871));
        System.out.println(isHappy(3970));
    }

    public static boolean isHappy(int n) {
        int result;

        do {
            result=0;
            while(n>0) {
                int digit = n % 10;
                result = result + digit * digit;
                n = n / 10;
            }
            n = result;
        } while(result!=4 && result!=1);

        if(result == 1)
            return true;
        else
            return false;
    }
}
