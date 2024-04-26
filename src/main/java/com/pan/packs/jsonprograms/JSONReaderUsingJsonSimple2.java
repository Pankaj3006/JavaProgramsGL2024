package com.pan.packs.jsonprograms;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JSONReaderUsingJsonSimple2 {

    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader fileReader = new FileReader(System.getProperty("user.dir")+"/employee.json");

        Object obj = jsonParser.parse(fileReader);
        JSONObject jsonObject = (JSONObject) obj;
        String fname = (String)jsonObject.get("firstName");
        String lname = (String)jsonObject.get("lastName");
        System.out.println(fname+":"+lname);
        JSONArray mails = (JSONArray)jsonObject.get("mails");
        for(Object mail:mails){
            System.out.println(mail);
        }

        JSONArray array = (JSONArray)jsonObject.get("address");
        for(Object arr:array) {
            jsonObject = (JSONObject) arr;
            String city = (String)jsonObject.get("city");
            Long pinCode = (Long)jsonObject.get("pinCode");
            String floor = (String)jsonObject.get("floor");
            System.out.println(city+":"+pinCode+":"+floor);
        }
    }
}
