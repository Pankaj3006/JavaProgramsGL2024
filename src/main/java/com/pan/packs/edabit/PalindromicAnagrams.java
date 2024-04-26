package com.pan.packs.edabit;

import java.util.HashMap;
import java.util.Map;

public class PalindromicAnagrams {

    public static void main(String[] args) {

        System.out.println(isPalindromePossible("wndnwrkpkihup"));
    }

    public static boolean isPalindromePossible(String str) {
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<ch.length; i++) {
            if(map.containsKey(ch[i]))
                map.put(ch[i], map.get(ch[i])+1);
            else
                map.put(ch[i], 1);
        }

        System.out.println(map);

        long c = map.entrySet().stream().filter(e->e.getValue()%2==0).count();

        if(c==map.size() || c==map.size()-1)
            return true;
        else
            return false;
    }
}
