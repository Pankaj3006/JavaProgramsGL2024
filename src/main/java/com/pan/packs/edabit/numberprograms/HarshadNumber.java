package com.pan.packs.edabit.numberprograms;

//A number is said to be Harshad if it's exactly divisible by the sum of its digits
public class HarshadNumber {

    public static void main(String[] args) {
        int num = 171;

        System.out.println(isHarshad(num));
    }

    public static boolean isHarshad(int n) {
        int sum =0;
        int temp = n;
        while(temp != 0){
            sum = sum + temp%10;
            temp = temp/10;
        }
        System.out.println(sum);

        if(n % sum ==0)
            return  true;
        else
            return false;
    }


}
