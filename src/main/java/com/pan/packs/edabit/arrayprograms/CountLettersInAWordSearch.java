package com.pan.packs.edabit.arrayprograms;

// Create a function that counts the number of times a particular letter shows up in the word search.

public class CountLettersInAWordSearch {

    public static void main(String[] args) {
        char[][] ch = {
                {'D', 'E', 'Y', 'H', 'A', 'D'},
                {'C', 'B', 'Z', 'Y', 'J', 'K'},
                {'D', 'B', 'C', 'A', 'M', 'N'},
                {'F', 'G', 'G', 'R', 'S', 'R'},
                {'V', 'X', 'H', 'A', 'S', 'S'}};

        System.out.println(letterCounter(ch, 'D'));

    }

    public static int letterCounter(char[][] arr, char c) {
        int count =0;
        for(int i=0; i< arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == c)
                    count++;
            }
        }

        return count;
    }
}
