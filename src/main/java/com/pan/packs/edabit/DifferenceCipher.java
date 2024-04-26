package com.pan.packs.edabit;

import java.util.Arrays;

// encrypt("Hello") ➞ [72, 29, 7, 0, 3]
// H = 72, the difference between the H and e is 29 (upper- and lowercase).
// The difference between the two l's is obviously 0.
public class DifferenceCipher {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(encrypt("Hello"))); // [72, 29, 7, 0, 3]
        System.out.println(Arrays.toString(encrypt("Sunshine"))); // [83, 34, -7, 5, -11, 1, 5, -9]

        System.out.println(decrypt(encrypt("Hello")));
        System.out.println(decrypt(encrypt("Sunshine")));
    }

    public static int[] encrypt(String str) {

        int[] a = new int[str.length()];

        for(int i=0; i<str.length(); i++) {
            if(i==0) {
                a[i] = str.charAt(i);
            } else {
                a[i] = str.charAt(i) - str.charAt(i-1);
            }
        }

        return a;
    }

    public static String decrypt(int[] arr) {

        String output = "";

        for(int i=0; i<arr.length; i++) {
            if(i == 0) {
                output += (char)arr[i];
            } else {
                int t = i;
                int sum =0;
                while(t>=0) {
                    sum += arr[t];
                    t--;
                }
                output += (char)sum;
            }
        }

        return output;
    }


}
