package com.pan.packs.jsonprograms;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JSONReaderUsingJsonSimple {

    public static void main(String[] args) throws IOException, ParseException {

        JSONParser jsonParser = new JSONParser();
        FileReader fileReader = new FileReader(System.getProperty("user.dir")+"/employee.json");

        Object obj = jsonParser.parse(fileReader);
        JSONObject jsonObject = (JSONObject) obj;
        System.out.println(jsonObject.get("firstName"));
        System.out.println(jsonObject.get("lastName"));
        System.out.println(jsonObject.get("mails"));
        System.out.println(jsonObject.get("address"));
    }
}
