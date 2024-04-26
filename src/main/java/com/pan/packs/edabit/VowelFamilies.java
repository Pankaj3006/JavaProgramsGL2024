package com.pan.packs.edabit;

// Write a function that selects all words that have all the same vowels (in any order and/or number) as
// the first word, including the first word.

// Frequency does not matter (e.g. if the first word is "loopy", then you can include words with any number
// of o's, so long as they only contain o's, and not any other vowels).

import java.util.ArrayList;
import java.util.List;

// Words will contain only lowercase letters, and may contain whitespaces.

public class VowelFamilies {

    public static void main(String[] args) {
        String[] arr = {"many", "carriage", "emit", "apricot", "animal"};
        String[] outputArray = sameVowelGroup(arr);

        for(int i=0; i<outputArray.length; i++) {
            System.out.println(outputArray[i]);
        }
    }

    public static String[] sameVowelGroup(String[] words) {

        List<Character> list = findVowels(words[0].toCharArray());

        return checkForSameVowels(words, list);
    }

    static String[] checkForSameVowels(String[] words, List li) {

        List<String> list = new ArrayList<>();
        for(String word:words) {
               if(li.containsAll(findVowels(word.toCharArray())))
                   list.add(word);
        }

        return list.toArray(new String[list.size()]);
    }

    static List findVowels(char[] ch) {

        List<Character> list = new ArrayList<>();

        for(int i=0; i<ch.length; i++) {
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i] == 'o' || ch[i] == 'u')
                list.add(ch[i]);
        }

        return list;
    }
}
