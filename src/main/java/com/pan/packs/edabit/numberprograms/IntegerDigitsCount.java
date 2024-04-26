package com.pan.packs.edabit.numberprograms;

//Create a function that counts the integer's number of digits.
public class IntegerDigitsCount {

    public static void main(String[] args) {
        int num = 36789;

        System.out.println(count(num));
    }

    public static int count(int n) {
        int count =0;
        if(n !=0) {
            while (n != 0) {
                count++;
                n = n / 10;
            }
            return count;
        } else {
            return 1;
        }
      //  return n/10==0 ? 1 : 1 + count(n/10);
    }

}
