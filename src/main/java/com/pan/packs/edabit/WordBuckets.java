package com.pan.packs.edabit;

// Write a function that divides a phrase into word buckets, with each bucket containing n
// or fewer characters. Only include full words inside each bucket.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBuckets {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bucketize("she sells sea shells by the sea", 7))); // ["she sells", "sea shells", "by the sea"]

    }

    public static String[] bucketize(String phrase, int n) {

        if(phrase.length()<n) {
            String[] arr = {phrase};
            return arr;
        }

        String words[] = phrase.split(" ");
        List<String> list = new ArrayList<>();
        StringBuffer bucket = new StringBuffer();
        int count =0;

        for(String word:words) {
            if(bucket.length() + word.length() <= n) {
                bucket.append(word).append(" ");
            }
            else {
                list.add(bucket.toString().trim());
                count++;
                bucket = new StringBuffer();
                bucket.append(word).append(" ");
            }
        }
        list.add(bucket.toString().trim());
        count++;

        return list.toArray(new String[list.size()]);
    }
}
