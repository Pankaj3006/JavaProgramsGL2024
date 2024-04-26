package com.pan.packs.jsonprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/config.properties");
        properties.load(fileInputStream);

        properties.forEach((k,v)-> System.out.println(k+"-->"+v));
        System.out.println("+++++++++++++++++++++++++++");
        properties.entrySet().forEach(k-> System.out.println(k.getKey()+"-->"+k.getValue()));
        System.out.println("+++++++++++++++++++++++++++");
        properties.keySet().forEach(k-> System.out.println(k+"-->"+properties.get(k)));

        FileOutputStream fileOutputStream = new FileOutputStream(System.getProperty("user.dir")+"/config.properties");
        properties.setProperty("browser", "firefox");
        properties.store(fileOutputStream, "updated By Separate Program");
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(properties.get("browser"));

    }
}
