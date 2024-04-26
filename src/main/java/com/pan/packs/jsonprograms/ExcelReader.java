package com.pan.packs.jsonprograms;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    public static void main(String[] args) throws IOException, InvalidFormatException {

        File file = new File("C:\\Users\\pankaj.gupta3\\Desktop\\TestPaginationInValidate.xlsx");
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(file);

        String sheetName = "ENG-41816";
        XSSFSheet sheet = xssfWorkbook.getSheet(sheetName);

        int rowNum = sheet.getLastRowNum();
        System.out.println("rowNum = " + rowNum);
        int colNum = sheet.getRow(0).getLastCellNum();
        System.out.println("colNum = " + colNum);
        Map<String, String> map;
        List<Map<String, String>> list = new ArrayList<>();

        for(int i=1; i<= rowNum; i++) {
            map= new HashMap<>();
            for(int j=0; j<colNum; j++) {
                String key = sheet.getRow(0).getCell(j).getStringCellValue();
                String value = sheet.getRow(i).getCell(j).getStringCellValue();
                map.put(key, value);
                //System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + "==>");
            }
            //System.out.println();
            list.add(map);
        }
        System.out.println(list);

        list.forEach(System.out::println);

//        list.forEach(e -> System.out.println(e.get("Collector_type Name") + "==>" +
//                                                e.get("Collector") + "==>" +
//                                                e.get("Title") + "==>" +
//                                                e.get("Template Name")));

        // System.out.println(list.get(0).get("Collector_type Name"));
    }
}
