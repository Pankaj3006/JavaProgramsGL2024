package com.pan.packs.naveenautomationlabs.javaprograms.stringprograms;

public class CheckSubStringPresentInGivenString {

    public static void main(String[] args) {
        String str = "pankajguptahdfcjavaseleniumsdet";
        String subStr = "hdfcjavasel";

        // Using Regex pattern
        System.out.println(str.matches("(.*)"+subStr+"(.*)"));

        // Using contains method
        System.out.println(str.contains(subStr));

        // using index method
        System.out.println(str.indexOf(subStr) != -1);

        // Using Detailed fashion
        boolean flag = false;
        int count =0;

        for(int i=0; i<str.length(); i++) {
            for(int j=i+1; j<str.length(); j++) {
                if(str.substring(i,j).equals(subStr)) {
                    flag = true;
                    count++;
                    break;
                }
            }
            if(count ==1)
                break;
        }

        System.out.println(flag);
    }
}
