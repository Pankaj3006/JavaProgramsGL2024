package com.pan.packs.naveenautomationlabs.javaprograms.numberprograms;

public class ReverseAnInteger {

    public static void main(String[] args) {
        int num = 12345;
        String str = String.valueOf(num);
        for(int i=str.length()-1; i>=0; i--) {
            System.out.print(""+str.charAt(i));
        }

        System.out.println();

        // 2nd Way
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        System.out.println(sb.reverse());

        int rev = 0;
        // 3rd Way
        while(num !=0)
        {
            rev = rev * 10 + num % 10;
            num = num/10;
        }
        System.out.println("Reverse number is: "+ rev);
    }
}
