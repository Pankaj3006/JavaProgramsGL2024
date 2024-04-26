package com.pan.packs.edabit;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StripURLQueryParameters {

    public static void main(String[] args) {
        String input = "https://edabit.com?a=1&b=2&c=2&a=3";
        System.out.println(stripUrlParams(input, new String[]{"b", "c"}));
    }

    public static String stripUrlParams(String url, String[] paramsToStrip) {

        String urlWithoutQueryParams = url.split("\\?")[0];
        String queryParams = url.split("\\?")[1];
        String[] listOfQueryParams = queryParams.split("&");
        Map<String, String> map = new HashMap<>();
        for(int i=0; i<listOfQueryParams.length; i++) {
            String[] pair = listOfQueryParams[i].split("=");

            int count = 0;

            if(paramsToStrip != null) {
                for (int j = 0; j < paramsToStrip.length; j++) {
                    if (paramsToStrip[j].equalsIgnoreCase(pair[0])) {
                        count++;
                    }
                }
            }

            if (count == 0) {
                map.put(pair[0], pair[1]);
                count = 0;
            }
        }

        return urlWithoutQueryParams+"?"+map.entrySet().stream().map(e->e.toString()).collect(Collectors.joining("&"));
    }
}
