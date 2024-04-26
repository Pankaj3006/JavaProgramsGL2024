package com.pan.packs.java8programs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BiConsumerTest {

    private static Properties properties;

    static {
        try {
            properties = new Properties();
            FileInputStream fileInputStream =
                    new FileInputStream(System.getProperty("user.dir") + "/config.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        map.put("Pankaj", 34);
        map.put("Divank", 16);
        map.put("Gunjan", 33);

        map.forEach((k,v)-> System.out.println(k+"-->"+v));
        System.out.println("===============");
        map.keySet().forEach(e-> System.out.println(e+"--->"+map.get(e)));
        System.out.println("===============");
        map.entrySet().forEach(e-> System.out.println(e.getKey()+"---->"+e.getValue()));
        System.out.println("===============");
        for(String key:map.keySet()) {
            System.out.println(key+"----->"+map.get(key));
        }
        System.out.println("===============");
        for(Map.Entry<String, Integer> entry:map.entrySet()) {
            System.out.println(entry.getKey()+"------>"+entry.getValue());
        }

        writeValue("url","https://amazon.in");

       System.out.println(getValue("browser"));
    }

    private static String getValue(String key) {
        return (String)properties.get(key);
    }

    private static void writeValue(String key, String value) throws IOException {
        FileOutputStream fileOutputStream =
                new FileOutputStream(System.getProperty("user.dir")+"/config.properties");

        properties.setProperty(key, value);

        properties.store(fileOutputStream, "updated On: "+System.currentTimeMillis()) ;
    }
}
