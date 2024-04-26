package com.pan.packs.edabit;

public class SentenceSearcher {

    public static void main(String[] args) {
        String txt = "I love Divyank. My world evolves in hers. My love for life.";

        System.out.println(function(txt, 3));
    }

    public static String function(String txt, int n) {
        String[] dotSeparated = txt.split("\\.");
        String[] spaceSeparated = txt.split(" ");

        if(n==-1)
            n = spaceSeparated.length-1;

        String required = "";

        for(int i=0; i<dotSeparated.length; i++) {
            if(dotSeparated[i].contains(spaceSeparated[n].replace(".",""))) {
                required = dotSeparated[i].trim() + ".";
                break;
            }
        }
        return  required;
    }
}
