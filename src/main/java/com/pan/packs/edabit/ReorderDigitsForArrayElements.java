package com.pan.packs.edabit;

// Create a function that reorders the digits of each numerical element in an array based on ascending (asc)
// or descending (desc) order.

import java.util.Arrays;
import java.util.Comparator;

public class ReorderDigitsForArrayElements {

    public static void main(String[] args) {
        int[] arr = {515, 341, 98, 44, 211};
        System.out.println(Arrays.toString(reorderDigits(arr, "asc")));
        System.out.println(Arrays.toString(method2(arr, "asc")));
    }

    public static int[] reorderDigits(int[] arr, String orderBy) {

        int[] array = new int[arr.length];

        for(int i=0; i< arr.length; i++) {
              char[] ch = String.valueOf(arr[i]).toCharArray();
               for(int j=0; j<ch.length; j++) {
                   for(int k=j+1; k<ch.length; k++) {
                       char temp;
                       if(orderBy.equalsIgnoreCase("asc")) {
                           if (ch[j] > ch[k]) {
                               temp = ch[j];
                               ch[j] = ch[k];
                               ch[k] = temp;
                           }
                       }
                       else {
                           if (ch[j] < ch[k]) {
                               temp = ch[j];
                               ch[j] = ch[k];
                               ch[k] = temp;
                           }
                       }
                   }
               }
               String str = new String(ch);
               array[i] = Integer.parseInt(str);
            }
        return array;
    }

    private static int[] method2(int[] arr, String orderBy) {
        return Arrays.stream(arr)
                .map(n -> Integer.parseInt(("" + n).chars()
                        .mapToObj(cp -> (char)cp)
                        .sorted(orderBy.equals("asc") ? Comparator.naturalOrder()
                                : Comparator.reverseOrder())
                        .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                        .toString()))
                .toArray();
    }
}
