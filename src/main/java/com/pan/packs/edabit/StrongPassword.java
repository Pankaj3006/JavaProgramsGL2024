package com.pan.packs.edabit;

// Create a function that determines the minimum number of characters needed to make a strong password.

//A password is considered strong if it satisfies the following criteria:

//Its length is at least 6.
//It contains at least one digit.
//It contains at least one lowercase English character.
//It contains at least one uppercase English character.
//It contains at least one special character: !@#$%^&*()-+

public class StrongPassword {

    public static void main(String[] args) {

        System.out.println(strongPassword("[?"));
    }

    public static int strongPassword(String password) {

        int count =0;
        int requiredLength = 0;
        int result = 0;
        if(checkForLength(password)<0) {
            requiredLength = 6-password.length();
        }
        if(checkForCapitalCharacter(password))
            count++;
        if(checkForSmallCharacter(password))
            count++;
        if(checkForDigit(password))
            count++;
        if(checkForSpecialCharacter(password))
            count++;

        if(requiredLength==0)
            result = 4-count;
        else if(requiredLength>count)
            result = requiredLength;
        else if(requiredLength==count)
            result = requiredLength;
        else
            result = 4-count;

        return result;
    }

    static int checkForLength(String password) {
        if(password.length()-6==0)
            return 0;
        else if(password.length()-6>0)
            return +1;
        else
            return -1;
    }

    static boolean checkForSmallCharacter(String password) {
        char[] ch = password.toCharArray();
        int count=0;
        for(int i=0; i<ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                count++;
                break;
            }
        }

        if(count==1)
            return true;
        else
            return false;
    }

    static boolean checkForCapitalCharacter(String password) {
        char[] ch = password.toCharArray();
        int count=0;
        for(int i=0; i<ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                count++;
                break;
            }
        }

        if(count==1)
            return true;
        else
            return false;
    }

    static boolean checkForDigit(String password) {
        char[] ch = password.toCharArray();
        int count=0;
        for(int i=0; i<ch.length; i++) {
            if (ch[i] >= 48 && ch[i] <= 57) {
                count++;
                break;
            }
        }

        if(count==1)
            return true;
        else
            return false;
    }

    static boolean checkForSpecialCharacter(String password) {
        char[] ch = password.toCharArray();
        int count=0;
        for(int i=0; i<ch.length; i++) {
            if (ch[i] >= 33 && ch[i] <= 47) {
                count++;
                break;
            }
        }

        if(count==1)
            return true;
        else
            return false;
    }
}
