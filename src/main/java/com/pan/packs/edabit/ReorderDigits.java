package com.pan.packs.edabit;

public class ReorderDigits {

    public static void main(String[] args) {
        int a = 5151;

        System.out.println(reorderDigit(a));
    }

    public static int reorderDigit(int num) {

        char[] ch = String.valueOf(num).toCharArray();
        for(int i=0; i<ch.length; i++) {
            for(int j=i+1; j<ch.length; j++) {
                char temp;
                if(ch[i] < ch[j]) {
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        String str = new String(ch);
        return Integer.parseInt(str);
    }
}
