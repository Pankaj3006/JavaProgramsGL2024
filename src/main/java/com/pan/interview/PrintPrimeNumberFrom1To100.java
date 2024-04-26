package com.pan.interview;

import java.util.ArrayList;
import java.util.List;

public class PrintPrimeNumberFrom1To100 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=100; i++) {
            if(!checkPrime(i)) {
                list.add(i);
            }
        }

        System.out.println(list);
    }

    public static boolean checkPrime(int n) {

        boolean flag = false;
        for(int i=2; i<=n/2; i++) {
            if(n%i==0) {
                flag = true;
                break;
            }
        }

        return flag;
    }
}
